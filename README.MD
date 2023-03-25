# Desarrollo taller clases abstractas, interfaces y excepciones

## Juan Manuel Restrepo Vela
## 1).  
Descripción del ejercicio:

Usted debe escribir un método que calcula el valor que debe pagar una persona por boletas de cine, lo cual depende de la cantidad de boletas que lleva. Si dentro del método encuentra que la cantidad de boletas no está dentro de los rangos establecidos, ¿debería lanzar una excepción o retornar cero? Explique brevemente su respuesta.

Respuesta:

se lanza una excepción si la cantidad de boletas no está dentro del rango establecido, ya que esto indica que algo está mal en el uso del método. En lugar de simplemente devolver cero, lo cual podría ser confuso para el usuario y dificultaría el diagnóstico del problema, la excepción ayuda a indicar claramente el error y a detener la ejecución del programa si es necesario.

## 2).

Usted debe escribir un método que consulta las materias que tiene inscritas un estudiante, a partir del código del estudiante. Si el estudiante no tiene materias inscritas, ¿debería lanzar una excepción o retornar null? Explique brevemente su respuesta.

Respuesta:

Si el estudiante hallado es = null lanza una excepción en el tiempo de ejecucion.

## 3).

Se desea crear un reproductor de Música, se tienen los formatos mp3 y wav. Ambos tienen como atributos la duración (minutos: segundos), tamaño, artista, compositor y genero musical. Ambos se reproducen de manera diferente.

1. Para una implementación en código, ¿usaría una clase abstracta o una interfaz? ¿Por qué? Desarrolle en Java una posible solución.

2. Si se decidiera agregar un formato de video en mp4, donde solo se quiere reproducir su audio, y a diferencia de mp3 y wav este no posee artista, compositor y género musical, sino creador y tipo de video. ¿Implementaría clase abstracta o interfaz? ¿Por qué? ¿Como quedaría en código añadiendo el formato de video?.

3. Si cada vez se quiere añadir un nuevo formato diferente en el reproductor, el código implementado por usted es capaz de adaptarse fácilmente. Para referencias consultar sobre escalabilidad en programación.

Respuestas:

1. La interfaz no seria una buena eleccion ya que una de sus principales caracteristicas es que son una coleccion de metodos abstractos con propiedades constantes (sus atributos), es este caso la duración y el tamaño no pueden ser constantes. 


2. Crearia una clase abstracta llamada "FormatoVideo" para que de ella extendieran todos los reproductores de MP4, ya que algunos formatos de MP4 difieren de otros.


3. Si, el codigo se adapta facil ya que solo es cuestion de crear la clase con su respectivo formato y hacer que extienda de "FormatoAudio" o de "FormatoVideo".

## 4).

Se requiere crear un Software para un banco, este maneja diferentes tipos de cuentas, Ahorro y Corriente, tienen como atributos el numero de cuenta, saldo, y un propietario. Se pueden realizar acciones como depositar y retirar. Al momento de retirar dinero, en la cuenta de ahorros, deberá restar el monto solicitado, y si realiza más de 3 retiros, deberá de restar un 1% del valor que retira, es decir si pide retirar un valor de 3000 unidades debe sacar un 1% que son 30 unidades, y restar un total de 3030 unidades si se cumple que se hacen más de 3 retiros. Para una cuenta corriente, no debe permitir realizar más de 5 retiros, además, al depositar en una cuenta de ahorros, se adicionará un 0.5% del valor depositado en el saldo para sus 2 primeros depósitos. Implemente una solución en Java, con clases abstractas o interfaces, y realice las validaciones correspondientes con el uso de excepciones propias.