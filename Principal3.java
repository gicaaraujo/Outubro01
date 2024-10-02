package Outubro01;

public class Principal3 {

	public static void main(String[] args) {

		Medico med = new Medico("Giovana", "cirurgiã carídaca", (int) 450.00, "5689");
		System.out.println("Médico: ");
		System.out.println("Nome: " + med.getNome());
		System.out.println("Especialidade: " + med.getEspecialidade());
		System.out.println("Valor da consulta: " + med.getValorConsulta());
		System.out.println("CRM: " + med.getCrm());
		med.agendarConsulta();
		
		Dentista dent = new Dentista("Isabella", "cirurgiã dentista", (int) 150.00, "2356");
		System.out.println("\nDentista: ");
		System.out.println("Nome: " + dent.getNome());
		System.out.println("Especialidade: " + dent.getEspecialidade());
		System.out.println("Valor da consulta: " + dent.getValorConsulta());
		System.out.println("CRO: " + dent.getCro());
		dent.agendarConsulta();
		
		Fisioterapeuta fisio = new Fisioterapeuta("Beatriz", "pós cirúrgico", (int) 250.00, "1452");
		System.out.println("\nFisioterapeuta: ");
		System.out.println("Nome: " + fisio.getNome());
		System.out.println("Especialidade: " + fisio.getEspecialidade());
		System.out.println("Valor da consulta: " + fisio.getValorConsulta());
		System.out.println("Créfito: " + fisio.getCrefito());
		fisio.agendarConsulta();
	
		
	}}