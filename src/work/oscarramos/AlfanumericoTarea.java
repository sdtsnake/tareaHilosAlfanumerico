package work.oscarramos;

import work.oscarramos.enums.Valores;

public class AlfanumericoTarea implements Runnable{

    private Valores valor;
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
            for (char i = 'A'; i < 'Z'; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
