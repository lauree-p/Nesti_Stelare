package models;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Orders {
	private static ResultSet resultat = null;

	public static void main(String[] args) {
		readArticleByOrders(1);

	}

	public static ArrayList<String> readAll() {
		ArrayList<String> orders = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT o.date_order,o.reception_date,o.state,s.company_name,a.nickName FROM orders o INNER JOIN suppliers s ON o.id_suppliers=s.id_suppliers INNER JOIN administrators a ON o.id_administrators=a.Id_administrators;";
			resultat = declaration.executeQuery(query);

			while (resultat.next()) {

				orders.add(resultat.getString("o.date_order") + " " + resultat.getString("o.reception_date") + " "
						+ resultat.getString("o.state") + " " + resultat.getString("s.company_name") + " "
						+ resultat.getString("a.nickName"));

			}

			;

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(orders);
		return orders;
	}

	public static ArrayList<String> readArticleByOrders(int id) {
		ArrayList<String> articles = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT a.name,p.type,co.buy_price,a.weight,u.NAME,co.quantity FROM is_contained co INNER JOIN articles a ON co.Id_articles=a.id_articles INNER JOIN products p ON a.id_products=p.Id_products INNER JOIN unity u ON a.id_unity=u.Id_unity WHERE co.Id_orders="
					+ id;
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				articles.add(resultat.getString("a.name") + " " + resultat.getString("p.type")+ " " + resultat.getInt("co.buy_price")+ " " + resultat.getInt("a.weight")+ " " + resultat.getString("u.NAME")+ " " + resultat.getInt("co.quantity"));
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}

		return articles;
	}
	public static void createOrders(String articleName, Double articleWeight, int idProduct,
			int idAdministrators, int idUnity) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "INSERT INTO `articles` (`id_articles`,`name`,`weight`,`state`,`id_administrators`,`id_products`,`id_unity`) VALUES (NULL, '"
					+ articleName + "', '" + articleWeight + "', 'a', '" + idAdministrators + "', '"+idProduct+"', '"+idUnity+"' )";
			declaration.executeUpdate(query);

		} catch (Exception e) {
			System.err.println("erreur lors de la creation");
		}
	}


}
