package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        System.out.println();

        Estudiante estudiante2 = new Estudiante("Juan Pérez", 20);
        estudiante2.mostrarDetalles();

        System.out.println();

        Estudiante estudiante3 = new Estudiante("María Gómez", 22, "Matemáticas");
        estudiante3.mostrarDetalles();
    }
}

