/*
                         numero
                           >= 0 e <= 25 ??
                       V      /    \  F
                Intervalo 0-25      numero >25 && numero <= 50 ??
                                       V  /          \ F
                                Intervalo 25,50      numero > 50 <= 75 ??
                                                V     /        \ F
                                            Intervalo 50,75     numero >=75 e <=100??
                                                            V    /          \ F
                                                    Intervalo 75, 100       Fora de intervalo

*/


import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        // setup
        Scanner teclado = new Scanner(System.in);

        double numero;

        // entrada
        numero = teclado.nextDouble();

        // analisando o 1o caso
        if ( numero >= 0.0  && numero <= 25.0 ){
            System.out.println("Intervalo [0,25]");
        }
        else if ( numero > 25.0 && numero <= 50 ){
            System.out.println("Intervalo (25,50]");
        }
        else if ( numero > 50.0 && numero <= 75.0 ){
            System.out.println("Intervalo (50,75]");
        }
        else if ( numero > 75.0 && numero <= 100.0 ){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }


        //encerramento
        teclado.close();
    }
}