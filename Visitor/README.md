# Patrón de diseño visitor

## Uso
Representar una operación a realizar en los elementos de una estructura dada.

## Beneficios
Permite definir una nueva operación sin tener que modificar las clases de los elementos con los que trabaja.

## Ejemplo
La idea es modelar una Oficina Postal a través de la cual puedes enviar paquetes y/o cartas. El precio del envío se determina dependiendo del destino (si es nacional o internacional) y en el caso de los paquetes también se toma en cuenta el peso.

En lugar de que los objetos (carta/paquete) estén encargados de calcular su precio, se creó una clase PostalVisitor que se encarga de calcular el costo total del envío de un cliente.
