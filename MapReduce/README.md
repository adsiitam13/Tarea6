# MapReduce

## Uso
Las funciones stream permiten manipular los elementos de una lista de manera simultánea. 
  * map() - aplica la operación que recibe como parámetro a cada uno de los elementos de la lista
  * reduce() - regresa un sólo valor combinando los elementos de un stream. Esta función recibe dos parámetros:
      * identidad: es tanto el valor inicial de la reducción como el valor defualt si no hay elementos en el strea,
      * acumulador: es una función que recibe dos patámetros, el resultado parcial de la reducción y el siguiente elemento del stream
      

## Ventajas
La ventaja principal de usar streams, y en este caso, map-reduce, es que puedes manejar colecciones enteras de elemetnos en una sola línea. De esta manera, ya no tienes que iterar sobre la lista para manipular los elementos de la lista uno por uno.

## Ejemplo

Este es un ejemplo sencillo de cómo hacer un MapReduce con stream. El bojetivo es saber cuántas palabras hay en total en una lista de oraciones. Es decir, cada elemento de la lista puede ser una oración o una palabra y lo que se quiere saber es cuántas palabras hay en todas las oraciones de la lista.
Si se hiciera de la manera tradicional tendríamos que utilizar un for para iterar sobre cada uno de los elementos de la lista y luego de cada uno de ellos obtener el número de palabras y después sumar el total, lo cual es desperdicio de código. 
Usando map-reduce todo esto se puede hacer en una línea.

Se usaron dos mappers, uno para dividir cada oración de la lista en palabras y otro para contar cuántas palabras hay en cada elemento. Finalmente se utiliza un _reduce()_ para sumar las palabras de cada uno de los elementos y así obtener el total de palabras.
