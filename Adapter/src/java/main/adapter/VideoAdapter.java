package adapter;

public class VideoAdapter implements MediaPlayer{
	private MediaPlayer player;

	public VideoAdapter(Tipo tipo){
		if(tipo.equalsIgnoreCase("vhs"))
			player= new VHSPlayer();
		else 
			player=new DVDPlayer();
	}

	public String play(String nombre){
		return player.play(nombre);
	}
}
