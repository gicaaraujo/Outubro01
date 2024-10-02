package Outubro01;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo("Thor", "M", "Husky Siberiano");
		System.out.println("Lobo: ");
		System.out.println("Nome: " + lobo.getNome());
		System.out.println("Sexo: " + lobo.getSexo());
		System.out.println("Raça: " + lobo.getRaca());
		lobo.emitirSom();
		lobo.correr();
		lobo.caminhar();
		lobo.dormir();
		
		Leao leao = new	Leao("Simba", "M", "Leão-do-Congo");
		System.out.println("\nLeão: ");
		System.out.println("Nome: " + leao.getNome());
		System.out.println("Sexo: " + leao.getSexo());
		System.out.println("Raça: " + leao.getRaca());
		leao.emitirSom();
		leao.correr();
		leao.caminhar();
		leao.dormir();
		
		Tigre tigre = new Tigre("Mia", "F", "Tigre-Malaio");
		System.out.println("\nTigre: ");
		System.out.println("Nome: " + tigre.getNome());
		System.out.println("Sexo: " + tigre.getSexo());
		System.out.println("Raça: " + tigre.getRaca());
		tigre.emitirSom();
		tigre.correr();
		tigre.caminhar();
		tigre.dormir();
		
		Cachorro cachorro = new	Cachorro("Apolo", "M", "Golden Retriever");
		System.out.println("\nCachorro: ");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Sexo: " + cachorro.getSexo());
		System.out.println("Raça: " + cachorro.getRaca());
		cachorro.emitirSom();
		cachorro.correr();
		cachorro.caminhar();
		cachorro.dormir();
		
		Gato gato = new	Gato("Marrie", "F", "Siamês");
		System.out.println("\nCachorro: ");
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Sexo: " + gato.getSexo());
		System.out.println("Raça: " + gato.getRaca());
		gato.emitirSom();
		gato.correr();
		gato.caminhar();
		gato.dormir();
	}

}