package Model;

import java.sql.ResultSet;
import java.util.Arrays;

public class Article {
	public static void main(String[] args) {
		readAll();
	}
	public static void readAll() {
		 try {
			 MyConnexion.openConnection();
		 java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
		 String query = "SELECT * FROM articles;";
		 ResultSet resultat = declaration.executeQuery(query);
		 /* Récupération des données */
		 while (resultat.next()) {
		 Object[] row = new Object[]{
		 resultat.getInt("id_articles"),
		 resultat.getString("name"),
		 resultat.getString("conditioning"),
		 resultat.getDouble("weight"),
		 resultat.getDouble("quantity"),
		 resultat.getString("state"),
		 resultat.getInt("id_administrators"),
		 resultat.getInt("id_products"),
		 resultat.getInt("id_unity")

		 };
		 System.out.println(Arrays.toString(row));
		 }
		 } catch (Exception e) {
		 System.err.println(
		 "erreur lors de la recuperation"
		 );
		 }
		}
}
