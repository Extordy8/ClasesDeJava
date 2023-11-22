/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Yo
 */
// Ejemplo de herencia con las clases "Vehiculo" y "Automovil"
abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("Arrancando el vehículo");
    }
}

// Clase derivada que hereda de Vehiculo
abstract class Automovil extends Vehiculo {
    private String modelo;

    public Automovil(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("Conduciendo el automóvil");
    }
}

// Uso de la herencia
public class main {
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota", "Corolla") {};
        miAuto.arrancar();
        miAuto.conducir();
    }
}