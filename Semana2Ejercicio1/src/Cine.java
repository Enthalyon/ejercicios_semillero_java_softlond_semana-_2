public abstract class Cine {
    protected int numeroDeBoletas; // Cantidad de boletas de cine.

    protected double precioBoletas; // Precio x boleta.

    protected int numeroDeSillas; // Cantidad de sillas del cine.

    protected int numeroDeclientes; // Cantidad de usuarios que pagaron por una boleta.

    protected int numeroDeEmpleados; // Personas que trabajan en el cine.

    protected double horarioDeApertura; // Horas de apertura del cine.

    protected double horarioDeCierre; // Horas de cierre del cine.

    protected String ubicacionCine; // Ubicacion del cine.


    protected Cine() {
    }

    public Cine(int numeroDeBoletas, double precioBoletas, int numeroDeSillas, int numeroDeclientes, int numeroDeEmpleados, double horarioDeApertura, double horarioDeCierre, String ubicacionCine) {
        this.numeroDeBoletas = numeroDeBoletas;
        this.precioBoletas = precioBoletas;
        this.numeroDeSillas = numeroDeSillas;
        this.numeroDeclientes = numeroDeclientes;
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.horarioDeApertura = horarioDeApertura;
        this.horarioDeCierre = horarioDeCierre;
        this.ubicacionCine = ubicacionCine;
    }

    public abstract double calcularValorBoletaCine();
}
