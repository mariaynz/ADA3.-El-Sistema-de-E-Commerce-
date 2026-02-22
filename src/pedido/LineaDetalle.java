/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

/**
 *
 * @author mariayanezojeda
 */
public class LineaDetalle {
    // Atributos
    private String producto;
    private int cantidad;
    private Double precio;
    
    public LineaDetalle(String producto, int cantidad, Double precio){
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
}
