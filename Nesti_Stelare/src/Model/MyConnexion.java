package Model;
import java.sql.Connection;
import java.sql.DriverManager;
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
	 // on ajoute nos param�tres
	 accessDataBase = DriverManager.getConnection(
	 url, utilisateur, motDePasse);
	 } catch (SQLException ex) {
	 Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE, null,
	ex);
	 }
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
	 
	