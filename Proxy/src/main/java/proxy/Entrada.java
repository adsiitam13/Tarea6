package proxy;

public class Entrada{
	public static void main(String[] args){
		ConciertoProxy proxy=new ConciertoProxy(new ConciertoRock());
		
		proxy.entrar(new Asistente("Andrea",18));
		proxy.entrar(new Asistente("Paola",15));
                proxy.entrar(new Asistente("Miguel",21));
                proxy.entrar(new Asistente("Mario",20));
                proxy.entrar(new Asistente("Gerardo",14));
                proxy.entrar(new Asistente("Sofía",19));
                proxy.entrar(new Asistente("Sebastián",30));
                proxy.entrar(new Asistente("Mauricio",22));
                proxy.entrar(new Asistente("Paulina",26));
                proxy.entrar(new Asistente("Leonora",40));
                proxy.entrar(new Asistente("Eduardo",50));
                proxy.entrar(new Asistente("Lucía",23));
		proxy.entrar(new Asistente("Fernanda",23));
	}
}
