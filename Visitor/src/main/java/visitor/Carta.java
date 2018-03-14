package visitor;

public class Carta implements Visitable{
	private String destino;

	public Carta(String destino){
		this.destino=destino;
	}

	public void accept(Visitor visitor){
		visitor.visit(this);
	}

	public String getDestino(){
		return destino
	}
}