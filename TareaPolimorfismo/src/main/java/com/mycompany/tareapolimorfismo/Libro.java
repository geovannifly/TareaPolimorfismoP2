/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class Libro extends ProductoFisico {

    private String autor;
    private int numPaginas;
    
        public Libro(String autor, int numPaginas, double peso) {
        super(peso);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

        @Override
    public String getNombre() {
        return "Libro: " + autor + " - " + numPaginas + " páginas";
    }
    
    @Override
    public double getPrecio() {
        // Lógica para calcular el precio de un libro
        return numPaginas * 0.05;
    }
}
