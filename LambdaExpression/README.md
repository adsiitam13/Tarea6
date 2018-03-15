# Expresiones Lambda

Las expresiones lambda se usan en la programación funcional y son una herramienta muy útil. Una expresión lambda te permite crear clases anónimas de interfaces que sólo tienen un método.

Esta nueva manera de programar disminuye la cantidad de código usado pues permite definir diferentes funcionalidades de una interfaz sin tener que crear una clase para cada una. Las expresiones lambda permiten pasar funciones como un argumento de otro método de manera sencilla.

## Ejemplo
En este ejemplo se tiene una interfaz _Test_ cuyas clases "hijas" definen un test que se puede pasar cómo parámetro a otra función. En este caso se creó una función _filtrar(Test test, Collection<Integer> lista)_ que filtra una lista de enteros de acuerdo con la prueba recibida.
  
El objetivo era que a partir de una lista dada se obtuviera una lista que sólo contiene los elementos impares de la original. De esta manera la prueba requerida era ver si _n%2!=0_. Esta se definió usando una expresión lambda en lugar de crear una clase llamada _Impares_ cuyo único método realizara la prueba mencionada.
