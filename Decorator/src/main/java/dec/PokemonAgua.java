package dec;
public class PokemonAgua implements Pokemon{
        private Pokemon p;

        public PokemonAgua(Pokemon p){
                this.p=p;
        }

        public void ataque(){
                p.ataque();
                System.out.println("El pokemon lanza un chorro de agua!");
        }

        public int getPoder(){
                return p.getPoder()+10;
        }

}
