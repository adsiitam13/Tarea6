package dec;
public class PokemonFuego implements Pokemon{
	private Pokemon p;	

	public PokemonFuego(Pokemon p){
		this.p=p;
	}

	public void ataque(){
		p.ataque();
		System.out.println("El pokemon lanza fuego!");
	}

	public int getPoder(){
		return p.getPoder()+15;
	}

}
