package factory.method;

public class DisqueraRock implements Disquera{

	public Disco crearDisco(TipoDisco tipo){
		return new DiscoRock(tipo);	
	}

}
