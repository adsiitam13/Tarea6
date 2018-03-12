package dec;

public class Pelea{

	public static void main(String[] args){
		System.out.println("RONDA 1:");
		// empezamos con un pokemon basico
		Pokemon pokemon=new PokemonBasico();
		pokemon.ataque();
		System.out.println("El pokemon tiene "+pokemon.getPoder()+" de poder");
		
		System.out.println("\nRONDA 2:");
		//añadimos poderes de fuego
		pokemon=new PokemonFuego(pokemon);
		pokemon.ataque();
		System.out.println("El pokemon tiene "+pokemon.getPoder()+" de poder");

		System.out.println("\nRONDA 3:");
		//añadimos poderes de agua
                pokemon=new PokemonAgua(pokemon);
                pokemon.ataque();
                System.out.println("El pokemon tiene "+pokemon.getPoder()+" de poder");

	
	}
}
