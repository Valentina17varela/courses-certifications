# Javascript Algorithms and Data Structures - freecodeCamp

![](https://img.shields.io/badge/Code-Javascript-informational?style=flat&logo=javascript&logoColor=yellow&color=f0db4f)

https://www.freecodecamp.org/learn/javascript-algorithms-and-data-structures/

<br>

## Comprobador de palindromos
Devuelve ```true``` si la cadena proporcionada es un palíndromo. De lo contrario, devuelve ```false```.

Un palíndromo es una palabra o frase que se escribe de la misma manera hacia adelante y hacia atrás, ignorando la puntuación, mayúsculas, minúsculas y espaciado.

> Nota: Tendrás que eliminar todos los caracteres no alfanuméricos (puntuación, espacios y símbolos) y convertir todo en mayúsculas o minúsculas para comprobar si hay palíndromos.

Pasaremos cadenas con formatos variables, como ```racecar```, ```RaceCar``` y ```race CAR``` entre otros.

También pasaremos cadenas con símbolos especiales, como ```2A3*3a2```, ```2A3 3a2``` y ```2_A3*3#A2```.

<br>

## Conversor de numeros romanos
Convierte el número proporcionado en un número romano.

| Números romanos | Números arábigos |
| --- | --- |
| M | 1000 |
| CM | 900 |
| D | 500 |
| CD | 400 |
| C	| 100 |
| XC | 90 |
| L	| 50 |
| XL | 40 |
| X | 10 |
| IX | 9 |
| V	| 5 |
| IV | 4 |
| I | 1 |

Todas las respuestas de los números romanos deben ser proporcionadas en mayúsculas.

<br>

## Cifrado César
Uno de los cifrados más simples y conocidos es el cifrado César, también conocido como cifrado por desplazamiento. En un cifrado por desplazamiento los significados de las letras se desplazan por una cantidad determinada.

Un uso moderno común es el cifrado ROT13, donde los valores de las letras son desplazados por 13 lugares. Así que A ↔ N, B ↔ O y así sucesivamente.

Escribe una función que reciba una cadena codificada en ROT13 como entrada y devuelva una cadena decodificada.

Todas las letras estarán en mayúsculas. No transformes ningún carácter no alfabético (espacios, puntuación, por ejemplo), pero si transmítelos.

<br>

## Validador de numeros telefonicos 

Devuelve ```true``` si la cadena pasada concuerda con un número de teléfono válido en Estados Unidos.

El usuario puede completar el campo del formulario de la forma que elija, siempre que tenga el formato de un número estadounidense válido. Los siguientes ejemplos son de formatos válidos para números estadounidenses (consulte las pruebas a continuación para otras variantes):

```
555-555-5555
(555)555-5555
(555) 555-5555
555 555 5555
5555555555
1 555 555 5555
```

Para este desafío se te presentará una cadena como 800-692-7753 o 8oo-six427676;laskdjf. Tu trabajo es validar o rechazar el número de teléfono estadounidense basado en cualquier combinación de los formatos proporcionados arriba. El código de área es obligatorio. Si el código de país es proporcionado, debes confirmar que el código de país es 1. Devuelve true si la cadena es un número de teléfono estadounidense valido; de lo contrario devuelve false.