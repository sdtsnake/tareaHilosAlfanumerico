package work.oscarramos;

import work.oscarramos.enums.Valores;

public class AlfanumericoTarea implements Runnable{

    private Valores valor;
    private final char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public AlfanumericoTarea(Valores valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        if(this.valor == Valores.NUMEROS){
            Integer numeros = 1;
            do{
                System.out.print(numeros+ " ");
                numeros ++;
            }while (numeros < 10);
            System.out.println();
        }else if(this.valor == Valores.LETRAS){
            for (char imp :alfabeto) {
                System.out.print(imp + " ");
            }
            System.out.println();
        }
    }
}
