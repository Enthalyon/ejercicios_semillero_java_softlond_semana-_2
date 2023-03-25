public abstract class CuentaBancaria {

    protected String numeroDeLaCuenta;

    protected double saldo;

    protected String propietarioDeLaCuenta;

    protected int numeroDeDepositos = 0;

    protected int numeroDeRetiros = 0;


    public CuentaBancaria(String numeroDeLaCuenta, String propietarioDeLaCuenta) {
        this.numeroDeLaCuenta = numeroDeLaCuenta;
        this.propietarioDeLaCuenta = propietarioDeLaCuenta;
    }

    public abstract double depositar(double depositoDinero);

    public abstract double retirar(double retiroDinero);

    public abstract void imprimirCuentaBancaria();

}
