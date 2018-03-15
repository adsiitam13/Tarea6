# Patrón Adapter

## Uso
Este patrón estructural funciona como un puente entre dos interfaces que no son compatibles.

## Beneficios 
Este patrón te permite combinar las funciones de dos interfaces sin tener que crear una nueva, es decir, te permite que dos interfaces que normalmente no podrían trabajar juntas, lo hagan. Esto se hace por medio de una clase que se encarga de manejar las interfaces incompatibles.

## Ejemplo
En este ejemplo se tiene un reproductor de BluRay, sin embargo su dueño necesita poder reproducir sus DVDs y sus VHS en el mismo aparato, por lo tanto se crea un adaptador que permita que el reproductor BluRay trabaje con los formatos anteriores.
