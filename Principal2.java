package Outubro01;

public class Principal2 {

	public static void main(String[] args) {

		Funcionario fun = new Funcionario("Joaquim", "15998351934","Rodolfo Miranda Leonel", 1,5224 );
		System.out.println(fun.getNome());
		System.out.println(fun.calcularSalario(10000.00, 1000));
		
		
		Horista hor = new Horista("\nMarcia", "15998351934","Rodolfo Miranda Leonel", 2,5225 );
		System.out.println(hor.getNome());
		System.out.println(hor.calcularSalario(100, 200));
		
		Jornada jor = new Jornada("\nPedro", "15998351934","Rodolfo Miranda Leonel", 3,5226 );
		System.out.println(jor.getNome());
		System.out.println(jor.calcularSalario(150, 220));
		
		Consultor cons = new Consultor("\nAmanda", "15998351934","Rodolfo Miranda Leonel", 4,5227 );
		System.out.println(cons.getNome());
		System.out.println(cons.calcularSalario(40000, 5000));
		
	}

}
