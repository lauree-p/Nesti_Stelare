package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Products {

	private static ResultSet resultat = null;

	public static void main(String[] args) {
		readIngredients();
		readKitchenUtensils();

	}

	public static ArrayList<String> readIngredients() {
		ArrayList<String> products = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT name, type, expiration_time_limit FROM products p INNER JOIN ingredients i ON p.id_products = i.id_ingredients";

			resultat = declaration.executeQuery(query);

			while (resultat.next()) {

				products.add(resultat.getString("name") + " " + resultat.getString("type") + " "
						+ resultat.getInt("expiration_time_limit"));
			}

			;

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(products);
		return products;
	}

	public static ArrayList<String> readKitchenUtensils() {
		ArrayList<String> products = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT name, type FROM products p INNER JOIN kitchen_utensils k ON p.id_products = k.Id_products";

			resultat = declaration.executeQuery(query);

			while (resultat.next()) {

				products.add(resultat.getString("name") + " " + resultat.getString("type"));
			}

			;

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(products);
		return products;
	}

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
			// faire fonction qui rentre dans la table ustensile
			createIngredients(name, expiration_time_limit);
			
			
		}
	}

	public static void update(String name, Double weight, String state, int idProduct, int idUnity, int id_article) {

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "UPDATE articles SET name='" + name + "', weight='" + weight + "', state='" + state
					+ "', id_products='" + idProduct + "', id_Unity='" + idUnity + "' WHERE id_articles=" + id_article
					+ ";";
			declaration.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("erreur lors de la mise a jour");
		}

	}

}
