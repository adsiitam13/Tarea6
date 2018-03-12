package adapter;

public class BluRayPlayer implements MediaPlayer{
	VideoAdapter adaptador;

	public BluRayPlayer(){

	}

	@Override
	public play(String nombre,String tipo){
		if(tipo.equalsIgnoreCase("bluray"))
			return "El archivo "+name+" se está reproduciendo.";
		else if(tipo.equalsIgnoreCase("vhs")||tipo.equalsIgnoreCase("dvd")) {
			adaptador=new VideoAdapter(tipo);
			return adaptador.play(nombre);
		}else
			return "Formato no compatible";
	}

}
