package abstractfac;

public class FactoryMaker{
	
	public FactoryMaker(){

	}
	
	public AbstractFactory crear(String tipo){
		if(tipo.equalsIgnoreCase("americano"))
			return new AmericanoFactory();
		else if (tipo.equalsIgnoreCase("soccer"))
			return new SoccerFactory();
		else{
			System.out.println("No se puede crear objeto");
			return null;
		}
	}
}
