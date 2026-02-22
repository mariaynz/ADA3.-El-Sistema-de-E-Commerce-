/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

/**
 *
 * @author mariayanezojeda
 */
public class Cliente {
    // atributos
    private String nombre;
    private String usuario;
    
    // constructor
    public Cliente(String nombre, String usuario){
        this.nombre = nombre;
        this.usuario = usuario;
    }
    
    public String getNombre() {
    return nombre;
}
}
