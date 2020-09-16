package com.doandgo.contributorsManagment.controller;

import java.sql.SQLException;
import java.util.List;

import com.doandgo.contributorsManagment.model.Contributor;

// classe Service qui regroupe les méthodes suivante : getAllPerson(), affiche(), isExist(), 

public class Service {

	public static List<Contributor> getAllPerson() throws SQLException {
		return Connect.getAllPerson();
	}

	public static void affiche(List<Contributor> list) {
		for (int i = 0; i < list.size(); i++) {

			Contributor user = list.get(i);
			System.out.println("p" + i + " : " + user.getFirstName() + " " + user.getLastName());

		}
	}

	public static boolean isExist(List<Contributor> list, String firstName, String lastName) {

		if (list == null || firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty())
			return false;

		for (Contributor personne : list) {
			if (personne.getFirstName().equals(firstName) && personne.getLastName().equals(lastName))
				return true;
		}

		return false;
	}


}
