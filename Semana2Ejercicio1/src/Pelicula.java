public class Pelicula extends Cine{
    double horaDeLafuncion; // Horario en el que se presenta la pelicula.
    double descuentoDeLaPelicula; // Descuento en las boletas por la pelicula.
    boolean esEstreno; // ¿La pelicula es un estreno o no?

    public Pelicula() {
    }

    public Pelicula(int numeroDeBoletas, double precioBoletas, int numeroDeSillas, int numeroDeclientes, int numeroDeEmpleados, String ubicacionCine, double horaDeLafuncion, double descuentoDeLaPelicula, boolean esEstreno) {
        super(numeroDeBoletas, precioBoletas, numeroDeSillas, numeroDeclientes, numeroDeEmpleados, 800, 2200, ubicacionCine);
        this.horaDeLafuncion = horaDeLafuncion;
        this.descuentoDeLaPelicula = descuentoDeLaPelicula;
        this.esEstreno = esEstreno;
    }

    @Override
    public double calcularValorBoletaCine() {
        if (this.numeroDeBoletas <= this.numeroDeSillas) {
            System.out.println("¿Cuantas boletas desea comprar?");

            if (this.esEstreno == true && this.numeroDeclientes >= 2) {
                this.descuentoDeLaPelicula = 2000;
                return this.precioBoletas - this.descuentoDeLaPelicula;
            } else if (this.esEstreno == false && this.numeroDeclientes >= 2) {
                this.descuentoDeLaPelicula = 5000;
                return this.precioBoletas - this.descuentoDeLaPelicula;
            }
        } else{
            throw new IllegalArgumentException("La cantidad de boletas no puede superar el numero de sillas");
        }

        return this.precioBoletas;
    }

    public void ingresoAlafunsion() {
        if (this.horaDeLafuncion <= this.horarioDeCierre && this.horaDeLafuncion >= this.horarioDeApertura) {
            System.out.println("¡Bienvenido a nuestra sala de cine!");
            if (this.numeroDeclientes == this.numeroDeBoletas) {
                System.out.println("Disfrute su pelicula");
            } else{
                throw new IllegalArgumentException("Solo pueda ingresar una persona por boleto");
            }
        }
    }
}