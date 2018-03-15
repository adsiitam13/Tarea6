# MapReduce

## Ejemplo

Este es un ejemplo sencillo de cómo hacer un MapReduce con stream. El bojetivo es saber cuántas palabras hay en total en una lista de oraciones. Es decir, cada elemento de la lista puede ser una oración o una palabra y lo que se quiere saber es cuántas palabras hay en todas las oraciones de la lista.
Si se hiciera de la manera tradicional tendríamos que utilizar un for para iterar sobre cada uno de los elementos de la lista y luego de cada uno de ellos obtener el número de palabras y después sumar el total, lo cual es desperdicio de código. 
Usando map-reduce todo esto se puede hacer en una línea.

Se usaron dos mappers, uno para dividir cada oración de la lista en palabras y otro para contar cuántas palabras hay en cada elemento. Finalmente se utiliza un _reduce()_ para sumar las palabras de cada uno de los elementos y así obtener el total de palabras.
