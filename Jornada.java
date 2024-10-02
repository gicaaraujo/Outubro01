package Outubro01;

public class Jornada extends Funcionario{
	
	public Jornada(String nome, String telefone, String endereco, int id, int matricula) {
		super (nome, telefone, endereco, id, matricula);
	}

	@Override
	public double calcularSalario(double salarioHora, double horaTrabalhada) {
		return salarioHora * horaTrabalhada;
	}
	
}