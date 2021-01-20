package models;

import java.sql.ResultSet;
import java.util.Arrays;

public class Administrators {


	public static Object[] row = null;

	public static Object[] readAll() {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM administrators;";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				row = new Object[] { resultat.getInt("Id_administrators"), resultat.getInt("is_super_admin"),
						resultat.getString("nickName"),resultat.getString("passWord")

				};
				System.out.println(Arrays.toString(row));
			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		return row;
	}

	public static Object[] readOne(int id) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM administrators WHERE Id_administrators =" + id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				row = new Object[] { resultat.getInt("Id_administrators"), resultat.getInt("is_super_admin"),
						resultat.getString("nickName"),resultat.getString("passWord")
				};

			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		
		return row;
		
	}

}
