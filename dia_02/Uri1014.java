import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        // setup
        Scanner teclado = new Scanner(System.in);

        // variáveis
        int km;
        double qtdLitros, consumo;

        // entrada
        km = teclado.nextInt();
        qtdLitros = teclado.nextDouble();
        
        // processamento
        consumo = km / qtdLitros;

        // saida
        System.out.printf("%.3f km/l", consumo);

        teclado.close();
    }
}