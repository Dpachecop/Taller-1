package Ejercicio3;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this("Nombre Genérico", 18, "Curso Genérico");
    }

    public Estudiante(String nombre, int edad) {
        this(nombre, edad, "Curso Genérico");
    }

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}