package dec;

public class Pelea{

	public static void main(String[] args){
		// empezamos con un pokemon basico
		Pokemon pokemon=new PokemonBasico();
		pokemon.ataque();
		System.out.println("El pokemon tiene "+pokemon.getPoder()+" de poder";

		//añadimos poderes de fuego
		pokemon=new PokemonFuego(pokemon);
		pokemon.ataque();
		System.out.println("El pokemon tiene "+pokemon.getPoder()+" de poder";


		//añadimos poderes de agua
                pokemon=new PokemonAgua(pokemon);
                pokemon.ataque();
                System.out.println("El pokemon tiene "+pokemon.getPoder()+" de poder";

	
	}
}
