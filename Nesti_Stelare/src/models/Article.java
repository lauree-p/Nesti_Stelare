package models;

//TODO : recup id depuis l'app, pas en dur, 

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Article {
	private static ResultSet resultat = null;
	private static Double buy_price_article = 0.0;

	static String oneArticle;

	public static void main(String[] args) {
		calculNbItem(8);

	}

	public static ArrayList<String> readAll() {
		ArrayList<String> articles = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT a.name,a.weight,a.state,p.type,u.NAME FROM articles a INNER JOIN products p ON a.id_products=p.Id_products INNER JOIN unity u ON a.id_unity=u.Id_unity;";
			resultat = declaration.executeQuery(query);

			while (resultat.next()) {

				articles.add(resultat.getString("a.name") + " " + resultat.getString("a.weight") + " "
						+ resultat.getString("u.NAME") + " " + resultat.getString("a.state") + " "
						+ resultat.getString("p.type"));

			}

			;

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(articles);
		return articles;
	}

	public static String readOne(int id) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT a.name,a.weight,a.state,p.type,u.NAME FROM articles a INNER JOIN products p ON a.id_products=p.Id_products INNER JOIN unity u ON a.id_unity=u.Id_unity WHERE id_articles ="
					+ id + ";";
			resultat = declaration.executeQuery(query);
			/* R�cup�ration des donn�es */
			while (resultat.next()) {
				oneArticle = resultat.getString("a.name") + " " + resultat.getString("a.weight") + " "
						+ resultat.getString("u.NAME") + " " + resultat.getString("a.state") + " "
						+ resultat.getString("p.type");
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		return oneArticle;

	}

	public static ArrayList<String> readSuppliersByArticle(int id) {
		ArrayList<String> suppliers = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT su.company_name,se.buy_price_article FROM sell se INNER JOIN suppliers su ON se.Id_suppliers=su.id_suppliers WHERE se.Id_articles ="
					+ id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* R�cup�ration des donn�es */
			while (resultat.next()) {
				suppliers.add(resultat.getString("su.company_name") + " " + resultat.getString("se.buy_price_article"));
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}

		return suppliers;
	}

	public static Double calculSellPrice(int id_article) {

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT MAX(buy_price) FROM `is_contained` s  WHERE Id_articles="
					+ id_article + ";";
			ResultSet resultat = declaration.executeQuery(query);
			while (resultat.next()) {
				buy_price_article = resultat.getDouble("MAX(buy_price)");
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		Double price_calculated = buy_price_article * 1.20;
		return price_calculated;
	}


	public static void createArticle(String articleName, Double articleWeight, int idProduct,
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

	public static void update(String name, Double weight,String state, int idProduct, int idUnity,int id_article ) {

		
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "UPDATE articles SET name='"+name+"', weight='"+weight+"', state='"+state+"', id_products='"+idProduct+"', id_Unity='"+idUnity+"' WHERE id_articles="+id_article+";";
			declaration.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("erreur lors de la mise a jour");
		}
		
	}

	public static int calculNbItem(int id_article) {
		int stock = 0; 
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT SUM(quantity) FROM is_contained WHERE Id_articles ="+id_article;
			ResultSet resultat = declaration.executeQuery(query);
			while (resultat.next()) {
				stock = resultat.getInt("SUM(quantity)");
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la r�cup�ration");
		}
return stock;
	}
}
