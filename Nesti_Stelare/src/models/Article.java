package models;
//TODO : recup id depuis l'app, pas en dur, changer le tableau de données que l'on recupere

import java.sql.ResultSet;
import java.util.Arrays;

public class Article {
	private static Double buy_price_article = 0.0;

	public static void main(String[] args) {
	}

	public static void readAll() {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM articles;";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				Object[] row = new Object[] { resultat.getInt("id_articles"), resultat.getString("name"),
						resultat.getString("conditioning"), resultat.getDouble("weight"),
						resultat.getDouble("quantity"), resultat.getString("state"),
						resultat.getInt("id_administrators"), resultat.getInt("id_products"),
						resultat.getInt("id_unity")

				};
				System.out.println(Arrays.toString(row));
			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
	}

	public static void readOne(int id) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM articles WHERE id_articles =" + id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				Object[] row = new Object[] { resultat.getInt("id_articles"), resultat.getString("name"),
						resultat.getString("conditioning"), resultat.getDouble("weight"),
						resultat.getDouble("quantity"), resultat.getString("state"),
						resultat.getInt("id_administrators"), resultat.getInt("id_products"),
						resultat.getInt("id_unity")

				};

			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
	}

	public static void readSuppliersByArticle(int id) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT DISTINCT *, buy_price_article FROM suppliers su INNER JOIN sell se ON su.id_suppliers=se.id_suppliers WHERE id_articles ="
					+ id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				Object[] row = new Object[] { resultat.getString("company_name"), resultat.getString("company_street"),
						resultat.getString("company_city"), resultat.getInt("company_cp"),
						resultat.getString("contact_name"), resultat.getString("state"),
						resultat.getDouble("buy_price_article")

				};

			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
	}

	public static Double calculSellPrice(int id_article) {

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT MAX(buy_price_article) FROM `sell` s INNER JOIN articles a ON s.Id_articles=a.id_articles WHERE a.Id_articles="
					+ id_article + ";";
			ResultSet resultat = declaration.executeQuery(query);
			while (resultat.next()) {
				buy_price_article = resultat.getDouble("MAX(buy_price_article)");
			}

		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		Double price_calculated = buy_price_article * 1.20;
		return price_calculated;
	}
}
