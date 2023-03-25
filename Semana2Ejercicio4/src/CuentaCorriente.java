public class CuentaCorriente extends CuentaBancaria{


    public CuentaCorriente(String numeroDeLaCuenta, String propietarioDeLaCuenta) {
        super(numeroDeLaCuenta, propietarioDeLaCuenta);
    }

    @Override
    public double depositar(double depositoDinero) {
        this.saldo += depositoDinero;
        numeroDeDepositos++;
        return this.saldo;
    }

    @Override
    public double retirar(double retiroDinero) {
        if (retiroDinero <= this.saldo && this.numeroDeRetiros <= 5) {
            System.out.println("Por favor espere mientras se realiza la transacción");
            this.saldo -= retiroDinero;
            numeroDeRetiros++;
        }else {
            throw new IllegalArgumentException("Transacción errada por saldo insuficienteo o limite de retiros superados");
        }
        return this.saldo;
    }

    @Override
    public void imprimirCuentaBancaria(){
        int numeroTransacciones = this.numeroDeDepositos + this.numeroDeRetiros;
        System.out.println("CUENTA CORRIENTE" + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Consignaciones: " + numeroDeDepositos + "\n" +
                "Retiros: " + numeroDeRetiros + "\n" +
                "Transacciones realizadas: " + numeroTransacciones);
    }

}