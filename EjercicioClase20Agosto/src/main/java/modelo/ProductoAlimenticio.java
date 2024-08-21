/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cpere
 */
public class ProductoAlimenticio extends Producto {

    private int garantia;
    private String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Producto Alimenticio: " + super.nombre + ", Garantía: " + garantia + " meses, Fecha de Caducidad: " + fechaDeCaducidad;
    }

    public int getGarantia() {
        return garantia;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    
    
}
