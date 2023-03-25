public abstract class FormatoVideo extends Formato{

    String tipoDeVideo;
    String creador;

    public FormatoVideo(String duracíon, String tamaño, String tipoDeVideo, String creador) {
        super(duracíon, tamaño);
        this.tipoDeVideo = tipoDeVideo;
        this.creador = creador;
    }
}
