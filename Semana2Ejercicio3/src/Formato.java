public abstract class Formato {

    String duracíon;
    String tamaño;

    public Formato(String duracíon, String tamaño) {
        this.duracíon = duracíon;
        this.tamaño = tamaño;
    }

    public abstract void reproducirAudio();

}
