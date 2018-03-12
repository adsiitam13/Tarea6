package adapter;

public class VHSPlayer implements MediaPlayer{
        public VHSPlayer(){
        }

        public play(String nombre){
                return "El archivo "+nombre+" se está reproduciendo";
        }
}
