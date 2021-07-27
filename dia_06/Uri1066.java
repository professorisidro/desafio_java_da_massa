import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        //setup
        Scanner teclado = new Scanner(System.in);

        int qtPar, qtImp, qtPos, qtNeg;
        int numero;

        qtPar = 0;
        qtImp = 0;
        qtPos = 0;
        qtNeg = 0;

        // entrada + processamento
        for (int contador=1; contador <= 5; contador++){
            numero = teclado.nextInt();

            if (numero % 2 == 0){
                qtPar++;   // qtPar = qtPar+1  ou qtPar += 1
            }
            else{
                qtImp++;
            }

            if (numero > 0){
                qtPos++;
            }
            else if (numero < 0) {
                qtNeg++;
            }
        }

        // saida
        System.out.println(qtPar + " valor(es) par(es)");
        System.out.println(qtImp + " valor(es) impar(es)");
        System.out.println(qtPos + " valor(es) positivo(s)");
        System.out.println(qtNeg + " valor(es) negativo(s)");

        // encerramento
        teclado.close();
    }
}