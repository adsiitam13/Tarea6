package adapter;

public class Reproductor{
	public static void main(String[] args){
		BluRayPlayer br=new BluRayPlayer();
		
		System.out.println(br.play("Cenicienta","vhs"));
		System.out.println(br.play("Los Juegos del Hambre","bluray"));
		System.out.println(br.play("Toy Story 3","dvd"));
		System.out.println(br.play("La Sirenita","avi"));
	}
}
