/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import modelo.Producto;
import java.util.List;

/**
 *
 * @author cpere
 */
public interface CalculadorDePrecio {

    double calcularPrecioTotal(List<Producto> productos);
}
