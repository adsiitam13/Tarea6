package proxy;

public class ConciertoRock implements Concierto{
	
	public ConciertoRock(){

	}

	public void entrar(Asistente asistente){
		System.out.printle(asistente.getName()+" entró al concierto");
	}

}
