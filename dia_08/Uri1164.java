import java.util.Scanner;

public class Uri1164{
    public static void main(String args[]){
        // setup
        Scanner teclado = new Scanner(System.in);
        int N; // numero de casos de testes
        int X; // meu numero
        int somaDiv;

        // ler os casos de testes
        N = teclado.nextInt();
        for (int contador=1; contador <= N; contador++){

            X = teclado.nextInt();
            somaDiv = 0;
            for (int divisor=1; divisor < X; divisor++){
                if (X % divisor == 0){  // X é divisível por este número q varia de 1 a X-1
                    somaDiv = somaDiv + divisor;
                }
            }
            if (X == somaDiv){
                System.out.println(X + " eh perfeito");
            }
            else{
                System.out.println(X + " nao eh perfeito");
            }
        }

        // encerramento
        teclado.close();
    }
}