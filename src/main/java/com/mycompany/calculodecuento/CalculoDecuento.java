/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodecuento;

/**
 *
 * @author Pablo Alexander
 */
public class CalculoDecuento {
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10.00);
    }

    public static void main(String[] args) {
        double monto = 125.00;
        double descuentoporDefecto = calcularDescuento(monto);
        double montoFinalDefecto = monto - descuentoporDefecto;
        System.out.println("Descuento por defecto (10%): " + descuentoporDefecto);
        System.out.println("Monto final a pagar: " + montoFinalDefecto);
        
        double descuentoPropuesto = calcularDescuento(monto, 25.00);
        double montoFinalPersonalizado = monto - descuentoPropuesto;
        System.out.println("\nDescuento propuesto (25%): " + descuentoPropuesto);
        System.out.println("Monto final a pagar: " + montoFinalPersonalizado);
    }
}


