package proxy;

public class ConciertoRock implements Concierto{
	
	public ConciertoRock(){

	}

	public void entrar(Asistente asistente){
		System.out.println(asistente.getName()+" entró al concierto");
	}

}
