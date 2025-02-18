package EjerciciosPraticos.Ejercicio1;

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

    //----------------------------------------------------------
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("The dead" , "Sebastian C" , 278);
        
        //Mostrar la información de los libros directamente
        System.out.println("Titulo: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Numero de páginas: " + libro1.numeroPaginas);

        System.out.println("--------------------------------");//Separador 

        System.out.println("Título: " + libro2.titulo);
        System.out.println("Autor: " + libro2.autor);
        System.out.println("Número de páginas:" + libro2.numeroPaginas);

        
    }
}
