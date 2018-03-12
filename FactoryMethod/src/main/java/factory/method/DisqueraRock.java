package factory.method;

public class DisqueraRock implements Disquera{

	public Disco crearDisco(String tipo){
		return new DiscoRock(tipo);	
	}

}
