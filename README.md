# GranjeroApp

## Descripción
Este proyecto simula un sistema en el que granjeros plantan verduras en un restaurante y clientes consumen esas verduras.

### GranjeroSimulatorApp
La clase `GranjeroSimulatorApp` contiene el método `main` y sirve como punto de entrada para la simulación. En este método, se crea un restaurante y se inician varios hilos para granjeros y clientes.

### Cliente
La clase `Cliente` implementa la interfaz `Runnable` y representa a un cliente que consume verduras del restaurante. Cada cliente tiene un nombre, una cantidad específica de verduras que desea consumir y una referencia al restaurante.

### Granjero
La clase `Granjero` implementa la interfaz `Runnable` y modela a un granjero que planta verduras en el restaurante. Cada granjero tiene un nombre, una cantidad de verduras que desea plantar, y una lista predefinida de tipos de verduras.



### Restaurante
La clase `Restaurante` representa el lugar donde se plantan y consumen las verduras. Tiene un almacén de verduras con una capacidad máxima. Los métodos `plantarVerdura` y `consumirVerdura` están sincronizados para garantizar un acceso seguro al almacén.

### Verdura
La clase `Verdura` modela una verdura con un nombre.

## Uso
Para ejecutar la simulación, simplemente ejecute la clase `GranjeroSimulatorApp`. Se crearán hilos para granjeros y clientes, y se simulará la plantación y consumo de verduras en el restaurante.

