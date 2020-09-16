package com.doandgo.contributorsManagment.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.doandgo.contributorsManagment.model.Contributor;

// classe qui concerne les methodes où il y a une connection necessaire, connect(), saveUser(),

/**
 * Method to connect with DB
 * 
 * @author smaur
 *
 */
public class Connect {

	private static Connection connect() throws SQLException {

		String url = "jdbc:mysql://127.0.0.1:3306/Contributors";
		String utilisateur = "root";
		String motDePasse = "root";
		Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

		System.out.println("Connecté !");

		return connexion;
	}

	/**
	 * Method to get the entire user's list
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static List<Contributor> getAllPerson() throws SQLException {

		List<Contributor> list = new ArrayList<Contributor>();

		Connection connexion = connect();

		Statement statement = null;
		ResultSet resultat = null;

		// pour créer requête
		statement = connexion.createStatement();

		// pour lire la requête //
		resultat = statement.executeQuery("SELECT * FROM users");

		//
		while (resultat.next()) {

			// je récupère les variables des lignes de ma tables Users

			String firstName = resultat.getString("firstName");
			String lastName = resultat.getString("lastName");

			Contributor user = new Contributor();

			// set
			user.setFirstName(firstName);
			user.setLastName(lastName);

			// add to list
			list.add(user);

		}
		return list;
	}

	/**
	 * Method to add and save a user in DB
	 * 
	 * @param contributor
	 * @throws SQLException
	 */
	public static void addUser(Contributor contributor) throws SQLException {

		// je prépare ma requête

		Connection connexion = connect();
		Statement statement = connexion.createStatement();

		statement.executeUpdate("INSERT INTO contributors.users (firstName, lastName) VALUES ('"
				+ contributor.getFirstName() + "','" + contributor.getLastName() + "')");
	}

	/**
	 * Method to delete a user
	 * 
	 * @throws SQLException
	 */
	public static void delete(Contributor contributor) throws SQLException {

		Connection connexion = connect();

		Statement statement = connexion.createStatement();
		

		statement.executeUpdate("DELETE FROM contributors.users WHERE firstName ='" + contributor.getFirstName()
				+ "' AND lastName = '" + contributor.getLastName() +"'" );
	}

	/**
	 * Method to edit a user in the DB's List
	 * 
	 * @param contributor
	 * @throws SQLException
	 */
	public static void edit(String firstName, String lastName) throws SQLException {

		Connection connexion = connect();

		Statement statement = connexion.createStatement();

		statement.executeUpdate("UPDATE contributors.users SET firstName = ?, lastName = ? WHERE id= ?");
	}

}
