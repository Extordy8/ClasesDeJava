/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Yo
 */
class Automovil extends Vehiculo {
    private int numeroDePuertas;
    private String tipoDeCombustible;
    private int capacidadDePasajeros;

    public Automovil(String marca, String modelo, int año, String color, int numeroDePuertas, 
            String tipoDeCombustible, int capacidadDePasajeros) {
        
        super(marca, modelo, año, color);
        this.numeroDePuertas = numeroDePuertas;
        this.tipoDeCombustible = tipoDeCombustible;
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }
}

