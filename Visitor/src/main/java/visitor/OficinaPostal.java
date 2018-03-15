package visitor;
 
import java.util.ArrayList;

public class OficinaPostal{

	private ArrayList<Visitable> objetos;

	public OficinaPostal(){
		objetos=new ArrayList<>();
	}

	public void agregar(Visitable visitable){
		objetos.add(visitable);
	}

	public double calcularCosto(){
		PostalVisitor visitor=new PostalVisitor();

		for(Visitable item:objetos){
			item.accept(visitor);
		}

		double total=visitor.getTotal();
		
		return total;
	}

	
}
