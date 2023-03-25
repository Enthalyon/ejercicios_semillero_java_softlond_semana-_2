public class Mp3 extends FormatoAudio{


    public Mp3(String duracíon, String tamaño, String artista, String compositor, String generoMusical) {
        super(duracíon, tamaño, artista, compositor, generoMusical);
    }

    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo PM3");
    }
}
