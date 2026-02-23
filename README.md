classDiagram
    class Pedido {
        -Long id
        -Double total
        +addProduct(String, int, Double)
    }
    class Cliente {
        -String nombre
        -String usuario
        +getNombre() String
    }
    class LineaDetalle {
        -String producto
        -int cantidad
        -Double precio
    }

  
