import java.util.Scanner;

public class Uri1184{
    public static void main(String args[]){
        // setup
        Scanner teclado = new Scanner(System.in);

        float  M[][] = new float[12][12];
        char   O;   // operacao S ou M
        float  soma;
        int    numElementos;

        // entrada
        O = teclado.nextLine().charAt(0);
        for (int l = 0; l < 12; l++){
            for (int c = 0; c < 12; c++){
                M[l][c] = teclado.nextFloat();
            }
        }

        soma = 0.0f;
        numElementos = 0;

        for (int l = 0; l< 12; l++){
            for (int c = 0; c < 12; c++){
                if (c < l){
                    soma = soma + M[l][c];
                    numElementos++;
                }
            }
        }

        // saída
        if (O == 'S'){
            System.out.printf("%.1f\n", soma);
        }
        else{
            System.out.printf("%.1f\n", soma/numElementos);
        }






        // encerramento
        teclado.close();
    }
}