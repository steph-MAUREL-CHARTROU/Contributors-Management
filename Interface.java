package com.doandgo.contributorsManagment.view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.doandgo.contributorsManagment.controller.Service;
import com.doandgo.contributorsManagment.model.Contributor;
import com.doandgo.contributorsManagment.controller.Connect;

public class Interface {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String response = "";
		Scanner sc = new Scanner(System.in);
		boolean close = false;

		System.out.println("Que souhaitez vous faire ? Saisissez : liste, ajouter, supprimer ou quitter");

		do {
			response = sc.nextLine();

			switch (response) {

			case "liste": {
				// afficher la liste
				// close = true;
				List<Contributor> list = Service.getAllPerson();
				Service.affiche(list);
				break;
			}

			case "ajouter": {

				// close = true;
				// je demande � l'utilisatuer les informations

				System.out.println("Ajout d'un salari�");
				System.out.println("le nom : ");
				String firstName = sc.nextLine();

				System.out.println("le pr�nom : ");
				String lastName = sc.nextLine();

				// je r�cup�re la liste

				List<Contributor> list = Service.getAllPerson();

				if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
					if (!Service.isExist(list, firstName, lastName)) {
						Contributor user = new Contributor();
						user.setFirstName(firstName);
						user.setLastName(lastName);

						list.add(user);
						Connect.addUser(user);

						System.out.println(
								" vous avez bien ajout� " + " " + user.getFirstName() + " " + user.getLastName());
					}
				}

				break;
			}

			case "supprimer": {

				System.out.println("Suppression d'un salari�");
				System.out.println("le pr�nom : ");
				String firstName = sc.nextLine();

				System.out.println("le nom : ");
				String lastName = sc.nextLine();

				// je r�cup�re la liste

				List<Contributor> list = Service.getAllPerson();

				// je v�rifie les champs et si le user � supprimer existe bien dans la BDD avec
				// isExist()

				if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
					if (Service.isExist(list, firstName, lastName)) {
						

						Contributor userToDelete = new Contributor();
							
					
						Connect.delete(userToDelete);

						System.out.println("suppression ok");
					}
				}

				break;
			}

			case "modifier": {

				System.out.println("Modifier les informations d'un salari�");
				System.out.println("le nom : ");
				String firstName = sc.nextLine();

				System.out.println("le pr�nom : ");
				String lastName = sc.nextLine();

				// je r�cup�re la liste

				List<Contributor> list = Service.getAllPerson();

				// je v�rifie les champs et si le user � supprimer existe bien dans la BDD avec
				// isExist()

				if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
					if (Service.isExist(list, firstName, lastName)) {

						System.out.println("Saisissez les nouvelles informations du salari�");
						System.out.println("le nom : ");
						String firstName1 = sc.nextLine();

						System.out.println("le pr�nom : ");
						String lastName1 = sc.nextLine();

						Contributor userToEdit = new Contributor();
						Connect.edit(firstName1, lastName1);

						System.out.println(" Vous avez bien modifi� les informations de " + userToEdit.getFirstName()
								+ " " + userToEdit.getFirstName());

					}

				}
				break;
			}

			case "quitter": {
				
				close = true;
				
				break;
			}
			}
			
		} while (!close);

		System.out.println("Merci � bient�t !");
	}
}
