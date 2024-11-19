package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles();

        System.out.println(); 

       
        CuentaBancaria cuenta2 = new CuentaBancaria("12345678", "Ahorros");
        cuenta2.mostrarDetalles();

        System.out.println(); 

       
        CuentaBancaria cuenta3 = new CuentaBancaria("87654321", 1500.75, "Corriente");
        cuenta3.mostrarDetalles();
    }
}
