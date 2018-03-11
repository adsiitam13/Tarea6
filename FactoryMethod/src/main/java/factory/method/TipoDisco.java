package factory.method;
public class TipoDisco{

	public String lp="LP";
	
	public String ep="EP";

	public String single="Single";	

	private String tipo;
	
	public TipoDisco(String tipo){
		this.tipo=tipo;
	}

	public String toString(){
		return tipo;
	}

}
