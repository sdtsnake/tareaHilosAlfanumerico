package work.oscarramos;

import work.oscarramos.enums.Valores;

public class EjecucionHilos {
    public static void main(String[] args) {
        AlfanumericoTarea tarea1 = new AlfanumericoTarea(Valores.LETRAS);
        AlfanumericoTarea tarea2 = new AlfanumericoTarea(Valores.NUMEROS);

        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);

        hilo1.start();

        hilo2.start();
    }
}
