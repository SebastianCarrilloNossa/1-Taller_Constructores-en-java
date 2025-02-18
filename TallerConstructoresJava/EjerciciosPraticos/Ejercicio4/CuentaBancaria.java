package EjerciciosPraticos.Ejercicio4;

public class CuentaBancaria {
    String tipoCuenta;
    String numeroCuenta; 
    Double saldo ;

 //CONSTRUCTOR POR DEFECTO
    public CuentaBancaria() {
        this.tipoCuenta = "Desconocido";
        this.numeroCuenta = "Desconocido";
        this.saldo = 0.0;
        
    }
    //CONSTRUCTOR CON PARAMETROS
    public CuentaBancaria(String tipoCuenta , String numeroCuenta ) {
        this.numeroCuenta = numeroCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;

    }
    //CONSTRUCTOR SOBRECARGADO
    public CuentaBancaria(String tipoCuenta , String numeroCuenta , Double saldo){
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

}
