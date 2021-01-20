package models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

//rajouter le type , le poids et le en stock dans readarticlebysuppliers
public class Suppliers {
	public static void main(String[] args) {
		readArticleBySuppliers(1);
	}

	public static ArrayList<String> readAll() {
		ArrayList<String> suppliers = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM suppliers;";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				suppliers.add(resultat.getInt("id_suppliers") + " " + resultat.getString("company_name") + " "
						+ resultat.getString("company_street") + " " + resultat.getString("company_city") + " "
						+ resultat.getInt("company_cp") + " " + resultat.getString("contact_name") + " "
						+ resultat.getString("contact_firstName") + " " + resultat.getInt("tel_number") + " "
						+ resultat.getString("state") + " " + resultat.getInt("id_administrators"));

			}
		} catch (

		Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		return suppliers;
	}

	public static String readOne(int id) {
		String oneSuppliers = null;
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM suppliers WHERE id_suppliers =" + id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				oneSuppliers = resultat.getInt("id_suppliers") + " " + resultat.getString("company_name") + " "
						+ resultat.getString("company_street") + " " + resultat.getString("company_city") + " "
						+ resultat.getInt("company_cp") + " " + resultat.getString("contact_name") + " "
						+ resultat.getString("contact_firstName") + " " + resultat.getInt("tel_number") + " "
						+ resultat.getString("state") + " " + resultat.getInt("id_administrators");


			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(oneSuppliers);
		return oneSuppliers;
	}

	public static ArrayList<String> readArticleBySuppliers(int id) {
		ArrayList<String> article = new ArrayList<String>();
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT DISTINCT a.name, se.buy_price_article  FROM suppliers su INNER JOIN sell se ON su.id_suppliers=se.id_suppliers INNER JOIN articles a ON a.id_articles=se.Id_articles WHERE su.id_suppliers ="
					+ id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				article.add(resultat.getString("name")+" "+resultat.getInt("buy_price_article"));


			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(article);
		return article;
	}

}
