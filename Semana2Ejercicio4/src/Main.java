public class Main {
    public static void main(String[] args) {
        CuentaDeAhorro cuentaDeAhorro1 = new CuentaDeAhorro("101","Pepito Perez");

        cuentaDeAhorro1.depositar(300000);
        cuentaDeAhorro1.imprimirCuentaBancaria();
        cuentaDeAhorro1.retirar(5000);
        cuentaDeAhorro1.imprimirCuentaBancaria();
        cuentaDeAhorro1.retirar(5000);
        cuentaDeAhorro1.imprimirCuentaBancaria();
        cuentaDeAhorro1.retirar(5000);
        cuentaDeAhorro1.imprimirCuentaBancaria();
        cuentaDeAhorro1.retirar(5000);
        cuentaDeAhorro1.imprimirCuentaBancaria();
        cuentaDeAhorro1.retirar(5000);
        cuentaDeAhorro1.imprimirCuentaBancaria();



    }
}