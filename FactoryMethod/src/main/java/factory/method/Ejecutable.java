package factory.method;
public class Ejecutable{
	public static void main(String[] args){
		Disquera disquera;
		Disco disco;

		// creamos discos pop
		disquera=new DisqueraPop();
		disco = disquera.crearDisco("ep");
		System.out.println(disco.toString());
		disco = disquera.crearDisco("single");
		System.out.println(disco.toString());


                // creamos discos de rock 
                disquera=new DisqueraRock();
                disco = disquera.crearDisco("lp");
                System.out.println(disco.toString());
                disco = disquera.crearDisco("ep");
                System.out.println(disco.toString());
	}

}
