public class Mp4 extends FormatoVideo{

    public Mp4(String duracíon, String tamaño, String tipoDeVideo, String creador) {
        super(duracíon, tamaño, tipoDeVideo, creador);
    }

    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo MP4");
    }
}
