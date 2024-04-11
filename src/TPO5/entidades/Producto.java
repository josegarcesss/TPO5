/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPO5.entidades;

/**
 *
 * @author Alakyan
 */
public class Producto {
    private String Nombre;
    private String Categoria;
    private double precio;

    public Producto() {
    }
    
    public Producto(String Nombre, String Categoria, double precio) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", Categoria=" + Categoria + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
