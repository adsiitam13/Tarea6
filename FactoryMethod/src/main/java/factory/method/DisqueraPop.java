package factory.method;

public class DisqueraPop implements Disquera{

	public Disco crearDisco(TipoDisco tipo){
		return new DiscoPop(tipo);
	}

}
