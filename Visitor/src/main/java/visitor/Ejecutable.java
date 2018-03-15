package visitor;

public class Ejecutable{

	public static void main(String[] args){

		OficinaPostal o=new OficinaPostal();

		//primer cliente quiere enviar dos cartas y un paquete
		o.agregar(new Carta("mexico"));
		o.agregar(new Carta("rusia"));
		o.agregar(new Paquete("mexico",20));

		//Obtenemos lo que tiene que pagar el cliente por el envio
		System.out.println("El costo del envio es $"+o.calcularCosto()+".");

		o=new OficinaPostal();
		//segundo cliente quiere enviar dos cartas y tres paquete
		o.agregar(new Carta("mexico"));
		o.agregar(new Carta("mexico"));
		o.agregar(new Paquete("mexico",20));
		o.agregar(new Paquete("usa",20));
		o.agregar(new Paquete("canada",20));

		
		//Obtenemos lo que tiene que pagar el cliente por el envio
		System.out.println("El costo del envio es $"+o.calcularCosto()+".");
	
	}

}
