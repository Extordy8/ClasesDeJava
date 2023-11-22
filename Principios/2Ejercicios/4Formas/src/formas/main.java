/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author Yo
 */
public class main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo("Círculo 1", 5.0);
        formas[1] = new Rectangulo("Rectángulo 1", 10.0, 5.0);
        formas[2] = new Triangulo("Triángulo 1", 8.0, 4.0);

        for (Forma forma : formas) {
            System.out.println("Nombre: " + forma.getNombre());
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
