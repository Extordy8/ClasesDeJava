/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulacion;

/**
 *
 * @author Yo
 */
// Ejemplo de encapsulación con una clase "CuentaBancaria"
abstract class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método público para realizar un depósito
    public void depositar(double monto) {
        saldo += monto;
    }

    // Método público para realizar un retiro
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Método público para obtener el saldo
    public double obtenerSaldo() {
        return saldo;
    }
}

// Uso de la encapsulación
public class main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Juan Perez", 1000) {};
        miCuenta.depositar(500);
        miCuenta.retirar(200);
        System.out.println("Saldo actual: " + miCuenta.obtenerSaldo());
    }
}