public class Wav extends FormatoAudio{

    public Wav(String duracíon, String tamaño, String artista, String compositor, String generoMusical) {
        super(duracíon, tamaño, artista, compositor, generoMusical);
    }

    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo WAV");
    }
}
