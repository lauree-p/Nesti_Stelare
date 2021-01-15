package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.xdevapi.Statement;

public class MyConnexion {
 static Connection accessDataBase = null;
 /**
 * Testons la connexion
 * @param args
 */


 public static void openConnection() {
	 /* Parametres de connexion */
	 
	 String url = "jdbc:mysql://localhost/nestistelare?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	 // nesti = nom de ma bdd
	 String utilisateur = "root";
	 String motDePasse = "";
	 try {
	 // on ajoute nos paramètres
	 accessDataBase = DriverManager.getConnection(
	 url, utilisateur, motDePasse);
	 } catch (SQLException ex) {
	 Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null,
	ex);
	 }
	 }
 public static boolean selectUser(String UserMailOrPseudo, String userPassword) {

     boolean flag = false;

     try {

         openConnection();

         String query = "SELECT * FROM administrators WHERE nickName = ? OR AND passWord= ?";
         PreparedStatement declaration = accessDataBase.prepareStatement(query);

         declaration.setString(1, UserMailOrPseudo);
         declaration.setString(2, userPassword);

         ResultSet resultat = declaration.executeQuery();

         if (resultat.next() == true) {
             flag = true;
         }

     } catch (Exception e) {

         System.err.println("user display error: " + e.getMessage());
     }

     closeConnection();

     return flag;
 }
 
public static void closeConnection() {
	 if (accessDataBase != null) {
	 try {
	 accessDataBase.close();
	 System.out.println("Close connection");
	 } catch (SQLException e) {
	 System.err.println(
	 "Erreur fermreture: " + e.getMessage()
	 );
	 }}}}
	 
	
