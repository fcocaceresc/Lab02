Taller Lab02 - Juego de Dados

Caso Juego de dados

Objetivo: Construir una solución al caso de un juego de dados usando los conceptos revisados sobre Java, POO y menús de consolas.

Modalidad: trabajo de pares.

1. Consideraciones para el Juego de dados

- Se requiere crear una clase Dado que permita simular el comportamiento básico de un dado para juegos de mesa (se lanza y se obtiene una cara numerada entre 1 y 6).

- A partir de la clase Dado, se requiere construir una clase llamada JuegoDados, que permita simular los elementos básicos del juego de dados.

- El juego consiste en "lanzar" 2 dados y calcular la suma de ambas caras superiores, si el resultado es 7 el jugador gana, sino ha perdido.

- Implementar una clase JuegoDadosConsola, que muestre un menú con opciones:

i. Jugar: Permita lanzar los dados, mostrar sus valores, calcular la suma y declarar si el jugador ganó o perdió.

ii. Salir: Si el jugador selecciona “Salir”, se le debe preguntar si realmente desea cerrar la aplicación (¿Está seguro que desea salir? (S/N)).

2. Considere una variante del Juego de dados

- Se debe ahora simular el juego entre 2 jugadores, para lo cual deberá implementar la clase Jugador.

- Considere que cada jugador juega un juego.

- Luego, implemente la clase JuegoVersus, donde se debe dar turnos alternados a los lanzamientos, es decir, lanza jugador1 (se ve su resultado) y luego lanza jugador2 (se ve su resultado) y así sucesivamente.

- Se debe calcular los resultados de cada ronda y obtener el ganador final en un set pre acordado de turnos. Este set lo definen previamente los jugadores y es "al primer intento" o al mejor de 3 o al mejor de 5 intentos.

- En una clase ConsolaJuegoVersus, se debe ir registrando lo que sucede en cada ronda del juego y mostrarlo por pantalla y cuando suceda, finalmente mostrar quien ganó (jugador1 o jugador2).

- Luego, se le consulta a los usuarios si desean cerrar la aplicación, si la respuesta es sí, se cierra la aplicación, en caso contrario pueden seguir jugando.

 

Casos de prueba
Debe implementar al menos uno de los siguientes casos de prueba.
Caso de prueba 1: Juego individual
Objetivo: Verificar que el juego individual responde correctamente a las reglas.

Criterios de éxito:

- Se muestran correctamente los valores de los dados.
- Se calcula bien la suma.
- Se muestra el mensaje correcto (ganar/perder).
- El menú funciona correctamente.
- La confirmación de salida es correcta.

Caso de prueba 2: Juego Versus
Objetivo: Verificar que la lógica de turnos, rondas y ganador funcione correctamente.

Criterios de éxito:

- Turnos alternados correctos.
- Resultados por ronda mostrados.
- Control de marcador funcionando.
- Declaración del ganador según modalidad.
- Opción de reiniciar juego o cerrar programa.

