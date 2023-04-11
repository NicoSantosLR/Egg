package Servicio;

import Entidad.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese número de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo actual:");
        double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Cuánto dinero va a ingresar?");
        double deposito = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + deposito);
    }

    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Cuánto dinero va a retirar?");
        double retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("La cantidad solicitada es mayor al saldo actual");
            System.out.println("Se retirará " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("Se retiró " + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double maxRetiro = cuenta.getSaldoActual() * 0.2;
        System.out.println("Cuánto dinero va a retirar?");
        double retiro = leer.nextDouble();
        if (retiro > maxRetiro) {
            System.out.println("Su retiro excede el máximo para extracción rápida");
        } else {
            System.out.println("Se retiró " + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI Cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo disponible: " + cuenta.getSaldoActual());
    }

}
