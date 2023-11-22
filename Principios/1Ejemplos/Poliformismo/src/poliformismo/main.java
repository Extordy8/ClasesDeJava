/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliformismo;

/**
 *
 * @author Yo
 */
// Ejemplo de polimorfismo con una interfaz "Sonido"
interface Sonido {
    void hacerSonido();
}

// Clases que implementan la interfaz Sonido
class Perro implements Sonido {
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato implements Sonido {
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

// Uso del polimorfismo con la interfaz Sonido
public class main {
    public static void main(String[] args) {
        Sonido miMascota = new Perro();
        miMascota.hacerSonido();

        miMascota = new Gato();
        miMascota.hacerSonido();
    }
}
