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
        return calcularDescuento(montoTotal, 10.0);
    }

    public static void main(String[] args) {
        double monto = 125.00;
        double descuentoDefecto = calcularDescuento(monto);
        double montoFinalDefecto = monto - descuentoDefecto;
        System.out.println("Descuento por defecto (10%): " + descuentoDefecto);
        System.out.println("Monto final a pagar: " + montoFinalDefecto);
    }
}
