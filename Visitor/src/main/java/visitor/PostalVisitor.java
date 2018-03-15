package visitor;

public class PostalVisitor implements Visitor{
	private double total;

	public PostalVisitor(){
		total=0;
	}

	public void visit(Paquete paquete){
		if(paquete.getPeso()<50)
			total+=600.00;
		else
			total+=250.00;

		if(!(paquete.getDestino()).equalsIgnoreCase("mexico"))
			total+=500.50;
	}

	public void visit(Carta carta){
		if(!(carta.getDestino()).equalsIgnoreCase("mexico"))
			total+=100;
	}

	public double getTotal(){
		return total;
	}

}
