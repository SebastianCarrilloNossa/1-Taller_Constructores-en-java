package EjerciciosPraticos.Ejercicio3;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    //CONSTRUCTOR POR DEFECTO
    public Estudiante() {
        this.nombre = "Nombre Desconocido";
        this.edad = 0;
        this.curso = "Curso Desconocido";
    }
    //CONSTRUCTOR CON PARAMETROS
    public Estudiante(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;

    }
    //CONTRUCTOR CON PARAMETROS Y UTILIZANDO THIS()
    public Estudiante(String nombre , int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sebastian", 18 , "POO");

        System.out.println("Nombre del estudiante: "+ estudiante.nombre);
        System.out.println("Edad del estudiante: "+ estudiante.edad);
        System.out.println("Curso del estudiante: "+ estudiante.curso);

    }



}
