package EjerciciosPraticos.Ejercicio4;

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
   
}
