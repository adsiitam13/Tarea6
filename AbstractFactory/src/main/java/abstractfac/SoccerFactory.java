package abstractfac;

public class SoccerFactory extends AbstractFactory{

	public SoccerFactory(){
	
	}

	public UniformeSoccer crearUniforme(){
		return new UniformeSoccer();
	}

	public EntrenadorSoccer contratarEntrenador(){
		return new EntrenadorSoccer();
	}

	public EquipoSoccer armarEquipo(){
		return new EquipoSoccer();
	}
}
