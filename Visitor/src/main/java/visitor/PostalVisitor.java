package visitor;

public class PostalVisitor implements Visitor{
	private double total;

	public PostalVisitor(){
		total=0;
	}

	public void visit(Paquete paquete){
		if(paquete.getPeso()<50)
			total+=600;
		else
			total+=250;

		if(!destino.equalsIgnoreCase("mexico"))
			total+=500;
	}

	public void visit(Carta carta){
		if(!destino.equalsIgnoreCase("mexico"))
			total+=100;
	}

	public double getTotal(){
		return total;
	}

}