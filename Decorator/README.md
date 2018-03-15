# Patrón de diseño Decorator

## Uso 
Permite al usuario añadir funcionalidad a un objeto sin la necesidad de modificar su estructura.

## Beneficios
Este patrón aporta muchos beneficios pues ahorra mucho tiempo ya que si se quiere agregar alguna funcionalidad a un objeto, entonces lo único que se tiene que hacer es "envolver" la clase original en otra que tenga las funciones nuevas. De esta manera no se tiene que reescribir el código y se pueden agregar o quitar tantas funcionalidades como sean necesarias.

## Ejemplo
En este ejemplo tenemos a un Pokemon básico, sin embargo este Pokemon puede evolucionar y adquirir poderes de fuego y/o poderes de agua. De esta manera, se crea la clase PokemonSimple y cuando este pokemon evoluciona entonces se le agrega la funcionalidad de la clase PokemonFuego o PokemonAgua.
