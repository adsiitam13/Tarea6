package factory.method;
public class DiscoPop implements Disco{

	private TipoDisco tipo;

	public DiscoPop(TipoDisco tipo){
		this.tipo=tipo;
	}

	public String toString(){
		return tipo + "pop";
	}

	public TipoDisco getTipoDisco(){
		return tipo;
	}

}
