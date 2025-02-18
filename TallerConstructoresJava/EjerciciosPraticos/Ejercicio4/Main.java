package EjerciciosPraticos.Ejercicio4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
    
    // Crear un objeto Libro
    System.out.println("Ingrese los detalles del Libro:");
    System.out.print("Título: ");
    String titulo = x.nextLine();
    System.out.print("Autor: ");
    String autor = x.nextLine();
    System.out.print("Número de páginas: ");
    int numeroPaginas = x.nextInt();
    

    

   // Crear un objeto CuentaBancaria
   System.out.println("Ingrese los detalles de la Cuenta Bancaria:");
    System.out.print("Tipo de cuenta: ");
    String tipoCuenta = x.nextLine();
    System.out.print("Número de cuenta: ");
    String numeroCuenta = x.nextLine();
    System.out.print("Saldo: ");
    double saldo = x.nextInt();



    // Crear un objeto Estudiante
    System.out.println("Ingrese los detalles del Estudiante:");
    System.out.print("Nombre: ");
    String nombre = x.nextLine();
    System.out.print("Edad: ");
    int edad = x.nextInt();
    System.out.print("Curso: ");
    String curso = x.nextLine();

    //IMPRIMER EL OBJETO CREADO (LIBRO) 
    Libro libro = new Libro(titulo, autor, numeroPaginas);
    System.out.println("Detalles del Libro: \n " + "Titulo: "+ libro.titulo );
    System.out.println("Autor: "+ libro.autor);
    System.out.println("Numero de paginas: "+ libro.numeroPaginas);
    System.out.println("________________________________________________");

//IMPRIMER EL OBJETO CREADO (CUENTABANCARIA) 
CuentaBancaria cuentaBancaria = new CuentaBancaria(tipoCuenta, numeroCuenta , saldo ) ;
System.out.println("Detalles de la cuenta bancaria: \n " + "Tipo de cuenta: "+ cuentaBancaria.tipoCuenta );
System.out.println("Numero de cuenta: "+ cuentaBancaria.numeroCuenta);
System.out.println("Saldo en la cuenta: "+ cuentaBancaria.saldo);
System.out.println("________________________________________________");

//IMPRIMER EL OBJETO CREADO (ESTUDIANTE)
    Estudiante estudiante = new Estudiante(nombre, edad, curso);
    System.out.println("Detalles de la cuenta bancaria: \n " + "Nombre del estudiante: "+ estudiante.nombre );
    System.out.println("Edad del estudiante: "+ estudiante.edad);
    System.out.println("Curso del estudiante: "+ estudiante.curso);
    System.out.println("________________________________________________");
}

    }
