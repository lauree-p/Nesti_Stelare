package models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

public class Administrators {

	public static void main(String[] args) {
		readAll();
	}

	public static ArrayList<String[]> readAll() {

		ArrayList<String> row = new ArrayList<String>();
		ArrayList<String[]> allAr = new ArrayList<String[]>();

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM administrators;";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				row.add(resultat.getInt("Id_administrators") + " " + resultat.getInt("is_super_admin") + " "
						+ resultat.getString("nickName") + " " + resultat.getString("passWord"));
			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		
		String[] test = new String[4];
		
		for (int i=0; i < row.size() ; i++) {
			test = row.get(i).split(" ", i); // [1,1,toto,toto2021]
			allAr.add(test); // [ [1,1,toto,toto2021] , [2,0,Lauré,poussinpiou] , ...
		}
		
		return allAr;
	}

	public static String readData(int row,int column) { 
		String data = null;
		for (int i=0; i < readAll().size()-1 ; i++) {
			data = readAll().get(row)[column].toString();
		}
		return data;
	}
	
	public static String readOne(int id) {

		String row = null;

		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "SELECT * FROM administrators WHERE Id_administrators =" + id + ";";
			ResultSet resultat = declaration.executeQuery(query);
			/* Récupération des données */
			while (resultat.next()) {
				row = resultat.getInt("Id_administrators") + " " + resultat.getInt("is_super_admin") + " "
						+ resultat.getString("nickName") + " " + resultat.getString("passWord");
			}
		} catch (Exception e) {
			System.err.println("erreur lors de la recuperation");
		}
		System.out.println(row);
		return row;

	}

}
