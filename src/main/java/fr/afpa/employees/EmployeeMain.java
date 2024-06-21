package fr.afpa.employees;

import java.util.ArrayList;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// TODO instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22", "Dupont", "Martin", 2500, "1995-03-28");
		Employee employee2 = new Employee("22ABC33", "Eboue", "Fabrice", 10000, "1995-03-28");
		Employee employee3 = new Employee("33ABC44", "Dujardin", "Jean", 15000, "1995-03-28");
		Employee employee4 = new Employee("44ABC55", "Random", "Guy", 9999, "1999-09-29");
		
		// TODO afficher les informations des employés avec System.out.println
		
		// System.out.println(employee1.toString());
		// System.out.println(employee2.toString());
		// System.out.println(employee3.toString());
		// System.out.println(employee4.toString());

		ArrayList<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		listEmployees.add(employee4);

		for(Employee employee : listEmployees){
			System.out.println(employee);
		}

	}
}

