/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class TareaPolimorfismo {

    public static void main(String[] args) {
CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(new Libro("El Quijote", "Cervantes", 864, 0.5));
        carrito.agregarProducto(new Electronico("iPhone 14", "Apple", 12, 0.2));
        carrito.agregarProducto(new ProductoDigital("Curso de Java", "PDF"));

        System.out.println("Precio total del carrito: " + carrito.calcularTotal());
    
    }
}
