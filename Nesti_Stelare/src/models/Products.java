package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Products {

	private static ResultSet resultat = null;

	public static void main(String[] args) {

	}

	// read ingredients.
	public static String[][] readIngredients() {

		ArrayList<String> products = new ArrayList<String>();
		ArrayList<String[]> arrayRow = new ArrayList<String[]>();

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT name, expiration_time_limit, p.Id_products FROM products p INNER JOIN ingredients i ON p.id_products = i.id_ingredients";

			resultat = declaration.executeQuery(query);

			while (resultat.next()) {

				products.add(resultat.getString("name") + " " + resultat.getInt("expiration_time_limit") + " "
						+ resultat.getString("Id_products"));
			}

			;

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}

		for (int i = 0; i < products.size(); i++) {
			arrayRow.add(products.get(i).split(" ", 3));
		}

		String[][] data = new String[arrayRow.size()][3];
		for (int i = 0; i < arrayRow.size(); i++) {
			data[i][0] = arrayRow.get(i)[0];
			data[i][1] = arrayRow.get(i)[1];
			data[i][2] = calculQuantity(arrayRow.get(i)[2]);

		}

		return data;
	}

	// read kitchen utensils.
	public static String[][] readKitchenUtensils() {

		ArrayList<String> products = new ArrayList<String>();
		ArrayList<String[]> arrayRow = new ArrayList<String[]>();

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT p.name, p.Id_products FROM products p INNER JOIN kitchen_utensils k ON p.id_products = k.Id_products";

			resultat = declaration.executeQuery(query);

			while (resultat.next()) {

				products.add(resultat.getString("name") + " " + resultat.getString("Id_products"));
			}

			;

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}

		for (int i = 0; i < products.size(); i++) {
			arrayRow.add(products.get(i).split(" ", 2));
		}

		String[][] data = new String[arrayRow.size()][2];
		for (int i = 0; i < arrayRow.size(); i++) {
			data[i][0] = arrayRow.get(i)[0];
			data[i][1] = calculQuantity(arrayRow.get(i)[1]);

		}

		return data;
	}

	// create products.
	public static void createProducts(String name, String type, int expiration_time_limit, int id_administrators) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "INSERT INTO `products` (`Id_products`, `name`, `Id_administrators`, `type`) VALUES (NULL,'"
					+ name + "', '" + id_administrators + "', '" + type + "');";
			declaration.executeUpdate(query);

		} catch (Exception e) {
			System.err.println("erreur lors de la creation");
		}

		if (type == "ing") {
			createIngredients(name, expiration_time_limit);

		} else if (type == "ute") {
			createKitchenUtensils(name);
		}
	}

	// create kitchen utensils.
	public static void createKitchenUtensils(String name) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "INSERT INTO `kitchen_utensils` (`Id_products`) VALUES (SELECT id_products FROM products WHERE name = '"
					+ name + "'));";
			declaration.executeUpdate(query);

		} catch (Exception e) {
			System.err.println("erreur lors de la creation");
		}

	}

	// create ingredients.
	public static void createIngredients(String name, int expiration_time_limit) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "INSERT INTO `ingredients` (`id_ingredients`, `expiration_time_limit`) VALUES ((SELECT id_products FROM products WHERE name = '"
					+ name + "') , '" + expiration_time_limit + "');";
			declaration.executeUpdate(query);

		} catch (Exception e) {
			System.err.println("erreur lors de la creation");
		}
	}

	// update products.
	public static void updateProducts(String name, String type, int expiration_time_limit, int id_products) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "UPDATE products SET name='" + name + "' WHERE id_products=" + id_products + ";";

			declaration.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("erreur lors de la mise a jour");
		}

		if (type == "ing") {
			updateIngredients(expiration_time_limit, id_products);
		}
	}

	// update ingredients.
	public static void updateIngredients(int expiration_time_limit, int id_products) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "UPDATE `ingredients` SET `expiration_time_limit` = '" + expiration_time_limit
					+ "' WHERE `ingredients`.`id_ingredients` = '" + id_products + "'; ";

			declaration.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("erreur lors de la mise a jour");
		}

	}

	// count quantity.
	public static String calculQuantity(String id_products) {
		String stock = "";
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT COUNT(*) FROM articles WHERE id_products =" + id_products;
			ResultSet resultat = declaration.executeQuery(query);
			while (resultat.next()) {
				stock = resultat.getString("COUNT(*)");
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la r�cup�ration");
		}
		return stock;
	}

}
