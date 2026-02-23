```mermaid
classDiagram
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

    class Pedido {
        -Long id
        -Double total
        +addProduct(String, int, Double)
    }

    Pedido "1" o-- "1" Cliente : Agregación
    Pedido "1" *-- "1..5" LineaDetalle : Composición
