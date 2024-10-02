package Outubro01;

public class Consultor extends Funcionario {
	
	public Consultor(String nome, String telefone, String endereco, int id, int matricula) {
		super (nome, telefone, endereco, id, matricula);
	}

	@Override
	public double calcularSalario(double valorTotal, double imposto) {
		return valorTotal - imposto;
	}

}
