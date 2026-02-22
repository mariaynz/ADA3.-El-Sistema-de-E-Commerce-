/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedido;

/**
 *
 * @author mariayanezojeda
 */
public class Pedido {

    // atributos
    private Long id;
    private Double total;
    private Cliente cliente;
    private LineaDetalle[] lineas;
    private int c = 0;
    
    // Constructor
    public Pedido(Long id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.lineas = new LineaDetalle[5]; // Capacidad para 5 productos
        this.total = 0.0;
    }
    
    // método para agregar los productos
    public void addProduct(String producto, int cantidad, Double precio) {
        if (c < 5) {
            lineas[c] = new LineaDetalle(producto, cantidad, precio);
            this.total += (precio * cantidad);
            c++;
        }
    }
    public static void main(String[] args) {
        // crear cliente
       Cliente client1 = new Cliente("Maria Yañez", "maria12345");
       
       // crear pedido
       Pedido order = new Pedido(2102L, client1);
       
       // añadir productos
       order.addProduct("Blusa", 2, 250.00);
       order.addProduct("Aretes", 5, 1000.00);
       
       Double totalConError = null;
       
       System.out.println("Pedido creado para: " + client1.getNombre());
        System.out.println("ID del pedido: " + order.id);
        System.out.println("Total calculado: $" + order.total);
        System.out.println("Valor nulo: " + totalConError);
    }
    
}
