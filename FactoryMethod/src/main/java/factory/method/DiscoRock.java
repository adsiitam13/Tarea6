package factory.method;

public class DiscoRock implements Disco{
	private TipoDisco tipo;

	public DiscoRock(TipoDisco tipo){
		this.tipo=tipo;
	}

	public String toString(){
		return tipo + "de rock";
	}

	public TipoDisco getTipoDisco(){
		return tipo;
	}

}
