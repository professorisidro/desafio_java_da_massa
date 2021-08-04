import java.util.Scanner;
public class Uri1180{
    public static void main(String args[]){
        // setup
        Scanner teclado = new Scanner(System.in);

        int N, X[];
        int menorValor, menorPosicao;

        // entrada
        N = teclado.nextInt();
        X = new int[N];   // declaro um vetor de N posições
        for (int pos=0; pos < N; pos++){
            X[pos] = teclado.nextInt();
        }

        // processamento
        // passo 1 - determinar seus valores de referência
        menorValor   = X[0];
        menorPosicao = 0;
        // passo 2 - verificar da posição 1 até o final se tem alguém menor q a referência
        for (int pos = 1; pos < N; pos++){
            if  (X[pos] < menorValor){
                menorValor = X[pos];
                menorPosicao = pos;
            }
        }

        // saída
        System.out.println("Menor valor: "+ menorValor);
        System.out.println("Posicao: "+ menorPosicao);





        // encerramento
        teclado.close();
    }
}