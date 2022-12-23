# tareaHilosAlfanumerico
Ejercicio final de hilos

Para la tarea se pide implementar una clase llamada AlfanumericoTarea que implemente la interface Runnable y tenga como atributo un enum llamado Tipo.

El enum Tipo tiene dos elementos NUMERO Y LETRA.

Si el tipo es NUMERO, mostrara los números del 1 al 10, excluyente el último.

Si el tipo es LETRA, mostrar las letras de la 'A' a la 'Z', inclusivo el último.

Crea un par de hilos de diferentes tipos y ejecutarlos.


en este ejercicio hay dos comits uno como lo resolvi y entregue yo y el otro con una mejora
segun lo visto en el ejemplo del profesor ya que desconocia que se podia hacer el siguiente 
for

            for (char i = 'A'; i < 'Z'; i++) {
                System.out.print(i + " ");
            }
