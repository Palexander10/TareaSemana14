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
        System.out.println("Hello World!");
    }
}
