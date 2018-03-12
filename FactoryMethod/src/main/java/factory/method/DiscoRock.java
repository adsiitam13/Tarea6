package factory.method;

public class DiscoRock implements Disco{
	private String tipo;

	public DiscoRock(String tipo){
		this.tipo=tipo;
	}

	public String toString(){
		return tipo + " de rock";
	}

	public String getTipoDisco(){
		return tipo;
	}

}
