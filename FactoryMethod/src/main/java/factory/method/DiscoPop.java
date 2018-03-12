package factory.method;
public class DiscoPop implements Disco{

	private String tipo;

	public DiscoPop(String tipo){
		this.tipo=tipo;
	}

	public String toString(){
		return tipo + " pop";
	}

	public String getTipoDisco(){
		return tipo;
	}

}
