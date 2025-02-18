/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.base;

/**
 *
 * @author HP
 */
public class Coche3 {
    String marca;
    String modelo;

    // Constructor por defecto
    public Coche3() {
        this.marca = "Desconocida";
    }

    // Constructor parametrizado
    public Coche3(String marca) {
        this.marca = marca;
    }

    // Constructor sobrecargado con dos parámetros
    public Coche3(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

