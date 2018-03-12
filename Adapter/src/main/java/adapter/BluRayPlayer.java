package adapter;

public class BluRayPlayer{
	VideoAdapter adaptador;

	public BluRayPlayer(){

	}

	
	public String play(String nombre,String tipo){
		if(tipo.equalsIgnoreCase("bluray"))
			return "El archivo "+nombre+" se está reproduciendo.";
		else if(tipo.equalsIgnoreCase("vhs")||tipo.equalsIgnoreCase("dvd")) {
			adaptador=new VideoAdapter(tipo);
			return adaptador.play(nombre);
		}else
			return "Formato no compatible";
	}

}
