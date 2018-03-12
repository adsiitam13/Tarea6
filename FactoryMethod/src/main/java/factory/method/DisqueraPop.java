package factory.method;

public class DisqueraPop implements Disquera{

	public Disco crearDisco(String tipo){
		return new DiscoPop(tipo);
	}

}
