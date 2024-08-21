/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class ProductoDigital implements Producto {
        private String formato;

    public ProductoDigital(String formato) {
        this.formato = formato;
    }
@Override
    public String getNombre() {
        return "Producto Digital: " + formato;
    }
    @Override
    public double getPrecio() {
        // Lógica para calcular el precio de un producto digital
        return 9.99;
    }
}
