public class Ejecutable{

	public static void main(String[] args){
		Disquera disquera;
		Disco disco;

		// creamos discos pop
		disquera=new DisqueraPop();
		disco = disquera.crearDisco(TipoDisco.ep);
		System.out.println(disco.toString());
		disco = disquera.crearDisco(TipoDisco.single);
		System.out.prinln(disco.toString());


                // creamos discos de rock 
                disquera=new DisqueraRock();
                disco = disquera.crearDisco(TipoDisco.lp);
                System.out.println(disco.toString());
                disco = disquera.crearDisco(TipoDisco.ep);
                System.out.prinln(disco.toString());
	}

}
