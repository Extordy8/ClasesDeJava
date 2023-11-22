/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;

/**
 *
 * @author Yo
 */
// Ejemplo de abstracción con una clase "Auto"
abstract class Auto {
    String marca;
    String modelo;

    // Constructor
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstraído para obtener información básica del auto
    public String obtenerInformacion() {
        return "Marca: " + marca + "n/ Modelo: " + modelo;
    }
}

// Uso de la abstracción
public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla") {};
        System.out.println(miAuto.obtenerInformacion());
    }
}

