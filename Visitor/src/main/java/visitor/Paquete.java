package visitor;

public class Paquete implements Visitable{
	private double peso;
	private String destino;

	public Paquete(String destino, String peso){
		this.destino=destino;
		this.peso=peso;
	}

	public void accept(Visitor visitor){
		visitor.visit(this);
	}

	public String getDestino(){
		return destino;
	}

	public double getPeso(){
		return peso;
	}
}