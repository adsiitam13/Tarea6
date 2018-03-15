# Patrón de diseño Factory Method

## Uso 
Define una interfaz (fábrica) para crear un objeto, pero permite que las subclases decidan cuál clase van a instanciar.

## Beneficios
Permite que los "hijos" hagan la instanciación de los objetos dependiendo de lo que necesiten.

## Ejemplo 
Tenemos una disquera que produce discos pero dependiendo del cliente estos discos pueden ser de rock o de pop y a su vez, los discos pueden ser EPs, LPs o singles. Para esto se crea una fábrica que primero determina el género del disco y a partir de ello puedes elegir el tipo de disco que se necesite.
