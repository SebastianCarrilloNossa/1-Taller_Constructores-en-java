package EjerciciosPraticos.Ejercicio4;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;
     //CONSTRUCTOR POR DEFECTO
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;

    }
    //CONSTRUCTOR CON PARAMETROS
    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo ;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }
}
