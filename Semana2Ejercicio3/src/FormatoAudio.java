public abstract class FormatoAudio extends Formato{

    String artista;
    String compositor;
    String generoMusical;

    public FormatoAudio(String duracíon, String tamaño, String artista, String compositor, String generoMusical) {
        super(duracíon, tamaño);
        this.artista = artista;
        this.compositor = compositor;
        this.generoMusical = generoMusical;
    }

}
