package AbstrataAnimal;

public class Leao extends Animal{

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void dormir() {
		System.out.println("O leao está dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("O leao está caminhando");
	}
	@Override
	public void correr() {
		System.out.println("O leao está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O leao está rugindo");
	}

}