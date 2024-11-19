package Ejercicio1;

public class Main {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println();

        
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        libro2.mostrarDetalles();
    }
}
