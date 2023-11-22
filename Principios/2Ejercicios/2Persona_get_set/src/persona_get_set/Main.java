/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona_get_set;

/**
 *
 * @author Yo
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Pedro");
        empleado.setEdad(25);
        empleado.setGenero("Masculino");
        empleado.setSueldo(50000.0);
        empleado.mostrarDatos();
        empleado.mostrarSueldo();
    }
}