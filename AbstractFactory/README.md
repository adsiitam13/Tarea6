# Patrón Abstract Factory

## Uso 
Es un patrón de diseño creacional y funciona como una super-fábrica la cual crea otras fábricas. 

## Beneficios
Es una muy buena manera de crear objetos pues hay una interfaz que se encarga de crear la fábrica de objetos relacionados sin la necesidad de especificar la clase.

## Ejemplo
Todos los equipos de deportes necesitan un entrenador, un uniforme y, por supuesto, un equipo. En este ejemplo la súper-fábrica es la que se encarga de hacer la fábrica del deporte deseado. A su vez, cada fábrica de deportes crea su propio uniforme, contrata a su entrenador y arma su equipo con el número de jugadores deseado.
En este ejemplo se creó una fábrica que crea o la fábrica de fútbol americano o una fábrica de fútbol soccer.
