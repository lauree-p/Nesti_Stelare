package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class SuperAdmin extends Administrators {
	public static void main(String[] args) {
		deleteAdmin(3);
	}

	public static void addAdmin(String nickName, String passWord) {
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "INSERT INTO `administrators` (`Id_administrators`, `is_super_admin`, `nickName`, `passWord`) VALUES (NULL, '0',  '"+nickName+"'  ,   '"+passWord+"'  )";
			declaration.executeUpdate(query);

		} catch (Exception e) {
			System.err.println("erreur lors de la creation");
		}
	}
	public static void updateAdmin(int id_admin, String nickName, String passWord) {
		
		
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "UPDATE administrators SET nickName='"+nickName+"', passWord='"+passWord+"' WHERE Id_administrators="+id_admin+";";
			declaration.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("erreur lors de la mise a jour");
		}
		
	}
	public static void deleteAdmin(int id_admin) {
		
		
		try {
			MyConnexion.openConnection();
			java.sql.Statement declaration = MyConnexion.accessDataBase.createStatement();
			String query = "DELETE FROM `administrators` WHERE `administrators`.`Id_administrators` = "+id_admin+";";
			declaration.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("erreur lors de la mise a jour");
		}
		
	}
	
	
}
