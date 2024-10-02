package Outubro01;

public class Horista extends Funcionario {

	public Horista(String nome, String telefone, String endereco, int id, int matricula) {
		super (nome, telefone, endereco, id, matricula);
	}

	@Override
	public double calcularSalario(double valorHora, double horaTrabalhada) {
		return valorHora * horaTrabalhada;
	}


}