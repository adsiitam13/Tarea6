package adapter;

public class DVDPlayer implements MediaPlayer{
	public DVDPlayer(){
	}

	public play(String nombre){
		return "El archivo "+nombre+" se está reproduciendo";
	}
}
