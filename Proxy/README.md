# Patrón de diseño Proxy

## Uso
En este patrón estructural una clase representa la funcionalidad de otra, es decir, provee una clase que controla el acceso a los objetos de otra clase.

## Beneficios
Permiten controlar el acceso a objetos de mejor manera pues la clase del objeto de interés sólo se encarga de implementar la funcionalidad del mismo y por otro lado se crea otra clase que sólo se encarga de controlar el acceso a las instancias de la primera clase, de esta manera se pueden quitar/aumentar restricciones sin ningún problema.

## Ejemplo
Va a haber un concierto en la ciudad y se necesita una persona(clase) que permita controlar quienees entan al concierto puesto que los menores de edad no pueden ingresar.
