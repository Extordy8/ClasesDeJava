/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Yo
 */
public class Main {
    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota", "Corolla", 2022, "Rojo",
                4, "Gasolina", 5);
        System.out.println("Marca: " + miAuto.getMarca());
        System.out.println("Modelo: " + miAuto.getModelo());
        System.out.println("Año: " + miAuto.getAño());
        System.out.println("Color: " + miAuto.getColor());
        System.out.println("Número de puertas: " + miAuto.getNumeroDePuertas());
        System.out.println("Tipo de combustible: " + miAuto.getTipoDeCombustible());
        System.out.println("Capacidad de pasajeros: " + miAuto.getCapacidadDePasajeros());
    }
}
