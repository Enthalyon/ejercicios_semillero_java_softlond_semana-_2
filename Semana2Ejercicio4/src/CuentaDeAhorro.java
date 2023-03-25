public class CuentaDeAhorro extends CuentaBancaria{


    public CuentaDeAhorro(String numeroDeLaCuenta, String propietarioDeLaCuenta) {
        super(numeroDeLaCuenta, propietarioDeLaCuenta);
    }

    @Override
    public double depositar(double depositoDinero) {
        if (numeroDeDepositos <= 2) {
            this.saldo += depositoDinero + (depositoDinero*0.5)/100;
        }else {
            this.saldo += depositoDinero;
        }
        numeroDeDepositos++;
        return this.saldo;
    }


    @Override
    public double retirar(double retiroDinero) {
        if (retiroDinero < this.saldo) {
            System.out.println("Por favor espere mientras se realiza la transacción");
            if (this.numeroDeRetiros > 3) {
                double retiroMasComision = (retiroDinero + (retiroDinero*1)/100);
                if(retiroMasComision < this.saldo){
                    this.saldo -= retiroMasComision;
                } else {
                    throw new IllegalArgumentException("Transacción errada, saldo insuficiente");
                }
            }else {
                this.saldo -= retiroDinero;
            }
            this.numeroDeRetiros++;
        }else {
            throw new IllegalArgumentException("Transacción errada, saldo insuficiente");
        }
        return this.saldo;
    }

    @Override
    public void imprimirCuentaBancaria(){
        int numeroTransacciones = this.numeroDeDepositos + this.numeroDeRetiros;
        System.out.println("CUENTA DE AHORRO" + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Consignaciones: " + numeroDeDepositos + "\n" +
                "Retiros: " + numeroDeRetiros + "\n" +
                "Transacciones realizadas: " + numeroTransacciones);
    }

}