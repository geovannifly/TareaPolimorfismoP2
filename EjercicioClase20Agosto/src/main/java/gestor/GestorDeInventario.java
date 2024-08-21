/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import modelo.CalculadorDePrecio;
import modelo.Producto;
import modelo.Descuento;
import servicio.*;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author cpere
 */
public class GestorDeInventario {

    private CalculadorDePrecio conDescuento;
    private CalculadorDePrecio sinDescuento;
    private CalculadorDePrecio porCategoria;

    public double totalConDescuento(List<Producto> productos, double descuento) {
        conDescuento = new CalculadorDePrecioConDescuento(descuento);
        return conDescuento.calcularPrecioTotal(productos);
    }

    public double totalSinDescuento(List<Producto> productos) {
        sinDescuento = new CalculadorDePrecioSinDescuento();
        return sinDescuento.calcularPrecioTotal(productos);
    }

    public double totalPorCategoria(List<Producto> productos, Categoria categoria) {
        porCategoria = new CalculadorDePrecioPorCategoria(categoria);
        return porCategoria.calcularPrecioTotal(productos);
    }

}
