package abstractfac;

public class Deportes{

	public static void main(String[] args){
		AbstractFactory factory;
		FactoryMaker fm=new FactoryMaker();

		// creamos el equipo de Americano
		factory=fm.crear("americano");
		(factory.crearUniforme()).crear();
		(factory.contratarEntrenador()).contratar();
		(factory.armarEquipo()).armar(30);

		// creamos un equipo de Soccer
                factory=fm.crear("soccer");
                (factory.crearUniforme()).crear();
                (factory.contratarEntrenador()).contratar();
                (factory.armarEquipo()).armar(15);
	}

}
