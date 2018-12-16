package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		int num = 0;
		List<Funcionario> func = new ArrayList<Funcionario>();
		int id;
		String name;
		double salario;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		num = sc.nextInt();

		for (int x = 0; x < num; x++) {
			System.out.printf("%nEmplyoee #%d:%n", x + 1);
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: ");
			salario = sc.nextDouble();
			func.add(new Funcionario(id, name, salario));
		}

		System.out.println("List of employees:");

		

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int search = sc.nextInt();
		// Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		Funcionario result = func.stream().filter(x -> x.getId() == search).findFirst().orElse(null);

		if (result == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			result.aumento(sc.nextDouble());
		}
		
		System.out.println();
		System.out.println("List of employees:");

		
		for (Funcionario x : func) {
			System.out.println(x);
		}

		sc.close();
	}
}
