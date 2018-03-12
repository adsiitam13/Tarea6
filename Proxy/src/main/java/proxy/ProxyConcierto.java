package proxy;

public class ConciertoProxy implements Concierto{

	public final int AFORO=10;
	public final int EDAD_PERMITIDA=18;
	private int numAsistentes;
	private Concierto concierto;

	public ConciertoProxy(Concierto concierto){
		this.concierto=concierto;
	}

	public void entrar(Asistente asistente){
		if (numAsistentes<AFORO && asistente.getEdad()<EDAD_PERMITIDA){
			concierto.entrar(asistente);
			numAsistentes++;
		}else
			System.out.println(asistente.getName()+" no puede entrar.");

	}

}
