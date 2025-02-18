/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.base;

/**
 *
 * @author HP
 */
public class Coche4 {
    String marca;
    String modelo;

    // Constructor con un parámetro
    public Coche4(String marca) {
        this.marca = marca;
    }

    // Llamada al constructor anterior usando `this()`
    public Coche4(String marca, String modelo) {
        this(marca); // Llama al constructor de un solo parámetro
        this.modelo = modelo;
    }
}
