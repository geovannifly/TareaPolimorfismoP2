/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public abstract class ProductoFisico implements Producto {

    private double peso;

    public ProductoFisico(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
