/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos.base;

/**
 *
 * @author HP
 */
public class CocheVehiculo extends Vehiculo {
    String marca;

    // Llama al constructor de la clase base usando `super()`
    public CocheVehiculo(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }
}
