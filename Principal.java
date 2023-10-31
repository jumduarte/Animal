package AbstrataAnimal;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("--- LEÃO---");
		Leao leao = new Leao("Simba", "Macho","rei-leão");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("\n---LOBO---");
		Lobo lobo = new Lobo("nemo", "Macho","Lobo guará");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("\n---TIGRE---");
		Tigre tigre = new Tigre("Diego", "Macho","Dente de Sabre");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("\n---GATO---");
		Gato gato = new Gato("Loki", "macho", "Gato Preto");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
		System.out.println("\n---CACHORRO---");
		Cachorro cachorro = new Cachorro("Athena", "Femea", "Golden Retriver");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
	}

}
