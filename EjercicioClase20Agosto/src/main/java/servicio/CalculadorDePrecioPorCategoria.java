/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.CalculadorDePrecio;
import modelo.Categoria;
import modelo.Producto;
import java.util.List;

/**
 *
 * @author cpere
 */
public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {

    private Categoria categoria;

    public CalculadorDePrecioPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            if (getCategoria().getProductos().contains(producto)) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
