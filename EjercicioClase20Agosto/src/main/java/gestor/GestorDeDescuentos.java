/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import modelo.Descuento;
import modelo.Producto;
import java.util.List;

/**
 *
 * @author cpere
 */
public class GestorDeDescuentos {

    public void aplicarDescuento(List<Producto> productos, Descuento descuento) {
        for (Producto producto : productos) {
            double nuevoPrecio = descuento.aplicarDescuento(producto.getPrecio());
            System.out.println("Nuevo precio para " + producto.getNombre() + ": " + nuevoPrecio);
        }
    }
}
