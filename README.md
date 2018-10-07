# Patrones de Diseño
> Este proyecto es la entrega de la práctica ECP1 realizada por Alejandro Puebla Holguin
> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*

##### Entidades

![Mis entidades](https://github.com/alexph9/APAW.ECP1.Alejandro.Puebla/blob/master/docs/Entities.png)

##### *Strategy Pattern*
El patrón Estrategia (Strategy) es un patrón de diseño para el desarrollo de software.
Encapsula algoritmos en clases, permitiendo que éstos sean re-utilizados e intercambiables. En base a un parámetro, que puede ser cualquier objeto, permite a una aplicación decidir en tiempo de ejecución el algoritmo que debe ejecutar.
La esencia de este patrón es encapsular algoritmos relacionados que son subclases de una superclase común, lo que permite la selección de un algoritmo que varia según el objeto y también le permite la variación en el tiempo.

###### Este patrón debe utilizarse cuando:

* Un programa tiene que proporcionar múltiples variantes de un algoritmo o comportamiento.

* Encapsula algoritmos en clases, permitiendo que éstos sean re-utilizados e intercambiables. En base a un parámetro, que puede ser cualquier objeto, permite a una aplicación decidir en tiempo de ejecución el algoritmo que debe ejecutar.
  La esencia de este patrón es encapsular algoritmos relacionados que son subclases de una superclase común, lo que permite la selección de un algoritmo que varia según el objeto y también le permite la variación en el tiempo.

* Encapsula algoritmos en clases, permitiendo que éstos sean re-utilizados e intercambiables. En base a un parámetro, que puede ser cualquier objeto, permite a una aplicación decidir en tiempo de ejecución el algoritmo que debe ejecutar.
 La esencia de este patrón es encapsular algoritmos relacionados que son subclases de una superclase común, lo que permite la selección de un algoritmo que varia según el objeto y también le permite la variación en el tiempo.

![Strategy Pattern](https://github.com/alexph9/APAW.ECP1.Alejandro.Puebla/blob/master/docs/general-strategy-pattern.png)

###### Ejemplo a realizar para el patrón Estrategia

Queremos desarrollar un traductor que de momento nos salude en inglés, español e italiano. Aunque en un futuro
nos gustaría que el traductor esté disponible en diversos idiomas. Para ello vamos a utilizar el patrón Estrategia ya que nos permite realizar esta acción.

* Interfaz Language: Define el método saludar (greet)

* Traductor: Es la clase encargada de escribir el saludo además se podrá elegir la estrategia que se quiere utilizar.

* English, Italian and Spanish classes: Implementan el método saludar de Language cada uno con su propia lógica.

## Estado del código

#### Build Status
###### Master
![Build Status](https://travis-ci.org/alexph9/APAW.ECP1.Alejandro.Puebla.svg?branch=master) 
###### Develop
![Build Status](https://travis-ci.org/alexph9/APAW.ECP1.Alejandro.Puebla.svg?branch=develop) 

#### Quality Gate
![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw%3AAPAW.ECP1.Alejandro.Puebla&metric=alert_status)

### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud
