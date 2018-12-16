package entities;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private int id;
	private String name;
	private double salario;

	List<String> list = new ArrayList<String>();

	public Funcionario(int id, String name, double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Funcionario(List<String> list) {
		super();
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void aumento(double porc) {
		salario = salario * (1 + porc / 100);
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %.02f", id, name, salario);
	}

}
