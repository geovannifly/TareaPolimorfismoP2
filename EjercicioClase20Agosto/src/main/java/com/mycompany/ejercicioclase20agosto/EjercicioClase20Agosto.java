/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicioclase20agosto;

import gestor.GestorDeInventario;
import servicio.CalculadorDePrecioPorCategoria;
import servicio.CalculadorDePrecioSinDescuento;
import servicio.CalculadorDePrecioConDescuento;
import modelo.CalculadorDePrecio;
import modelo.Categoria;
import modelo.Proveedor;
import modelo.ProductoAlimenticio;
import modelo.ProductoElectronico;
import modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cpere
 */
public class EjercicioClase20Agosto {

    public static void main(String[] args) {
        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor 1");
        Proveedor proveedor2 = new Proveedor("Proveedor 2");

        // Crear productos
        Producto p1 = new ProductoElectronico("Laptop", 1500, 5, proveedor1, 24, "2026-01-01");
        Producto p2 = new ProductoAlimenticio("Leche", 1.5, 100, proveedor2, 6, "2025-01-01");
        Producto p3 = new ProductoElectronico("Smartphone", 800, 10, proveedor1, 12, "2026-12-31");
        Producto p4 = new ProductoAlimenticio("Pan", 0.5, 200, proveedor2, 3, "2024-08-01");

        // Agregar productos a proveedores
        proveedor1.agregarProducto(p1);
        proveedor1.agregarProducto(p3);
        proveedor2.agregarProducto(p2);
        proveedor2.agregarProducto(p4);

        // Crear categoría y agregar productos
        Categoria categoriaElectronicos = new Categoria("Electrónicos");
        categoriaElectronicos.agregarProducto(p1);
        categoriaElectronicos.agregarProducto(p3);

        Categoria categoriaAlimentos = new Categoria("Alimentos");
        categoriaAlimentos.agregarProducto(p2);
        categoriaAlimentos.agregarProducto(p4);

        // Crear lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);

        // Calcular precio total del inventario con diferentes estrategias
        GestorDeInventario gestor = new GestorDeInventario();
        System.out.println("Precio total sin descuento: " + gestor.totalSinDescuento(productos));
        System.out.println("Precio total con descuento: " + gestor.totalConDescuento(productos, 10));
        System.out.println("Precio total para categoría Electrónicos: " + gestor.totalPorCategoria(productos, categoriaElectronicos));
        System.out.println("Precio total para categoría Alimentos: " + gestor.totalPorCategoria(productos, categoriaAlimentos));



    }
}
