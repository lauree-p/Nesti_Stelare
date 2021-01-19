package models;

import java.sql.ResultSet;
import java.util.Arrays;

public class Suppliers {
 public static void main(String[] args) {

}
 public static void readAll() {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM suppliers;";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				Object[] row = new Object[] { resultat.getInt("id_suppliers"), resultat.getString("company_name"),
						resultat.getString("company_street"), resultat.getString("company_city"),
						resultat.getInt("company_cp"), resultat.getString("contact_name"),
						resultat.getString("contact_firstName"), resultat.getInt("tel_number"),
						resultat.getString("state"),resultat.getInt("id_administrators")

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
			String query = "SELECT * FROM suppliers WHERE id_suppliers =" + id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				Object[] row = new Object[] { resultat.getInt("id_suppliers"), resultat.getString("company_name"),
						resultat.getString("company_street"), resultat.getString("company_city"),
						resultat.getInt("company_cp"), resultat.getString("contact_name"),
						resultat.getString("contact_firstName"), resultat.getInt("tel_number"),
						resultat.getString("state"),resultat.getInt("id_administrators")

				};
				System.out.println(Arrays.toString(row));
			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
	}

	public static void readArticleBySuppliers(int id) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT DISTINCT a.name, buy_price_article  FROM suppliers su INNER JOIN sell se ON su.id_suppliers=se.id_suppliers INNER JOIN articles a ON a.id_articles=se.Id_articles WHERE su.id_suppliers ="
					+ id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				Object[] row = new Object[] { resultat.getString("name"),resultat.getInt("buy_price_article")

				};
				

			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
	}
 
}
