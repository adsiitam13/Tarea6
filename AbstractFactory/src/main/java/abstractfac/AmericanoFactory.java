package abstractfac;

public class AmericanoFactory extends AbstractFactory{

        public AmericanoFactory(){

        }

        public UniformeAmericano crearUniforme(){
                return new UniformeAmericano();
        }

        public EntrenadorAmericano contratarEntrenador(){
                return new EntrenadorAmericano();
        }

        public EquipoAmericano armarEquipo(){
                return new EquipoAmericano();
        }
}
