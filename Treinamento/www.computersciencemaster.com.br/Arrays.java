import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Arrays {
    public static void main(String args[]){
        //entradas
        Scanner in = new Scanner(System.in);
        int vetor[];
        int soma = 0;
        vetor = new int[10];

        
        
        //processamento
        System.out.println("Digitos para armazenamento: ");
      
        for( int i = 0 ; i < 10 ; i++ ) {
            vetor[i] = in.nextInt();
        }

        System.out.println();

        for( int i = 0 ; i < 10 ; i++ ){
            soma = soma + vetor[i];

        }
        
        //saidas
        for(int i: vetor){
            System.out.println(i);
        }

        System.out.print("A soma é: " + soma);



        //fechamento
        in.close();
    }



}
