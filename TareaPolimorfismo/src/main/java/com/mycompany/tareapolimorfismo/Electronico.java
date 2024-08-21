/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareapolimorfismo;

/**
 *
 * @author cpere
 */
public class Electronico extends ProductoFisico {

    private String marca;
    private int garantiaMeses;
    
    public Electronico(String marca, int garantiaMeses, double peso) {
        super(peso);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

@Override
    public String getNombre() {
        return "Electrónico: " + marca + " - " + garantiaMeses + " meses de garantía";
    }


        @Override
    public double getPrecio() {
        // Lógica para calcular el precio de un electrónico
        // En lugar de llamar a super.getPrecio(), calcula el precio directamente
        return (1 + garantiaMeses * 0.02);
    }
}
