package adapter;

public class VideoAdapter implements MediaPlayer{
	private MediaPlayer player;

	public VideoAdapter(String tipo){
		if(tipo.equalsIgnoreCase("vhs"))
			player= new VHSPlayer();
		else 
			player=new DVDPlayer();
	}

	public String play(String nombre){
		return player.play(nombre);
	}
}
