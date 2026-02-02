package EstruturasDeControle;

import java.util.Scanner;

public class ElseIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma nota de 0 a 10");
        double numero = entrada.nextDouble();

        if(numero >10 || numero <=0){
            System.out.println("Nota invalida");
        } else {
            System.out.println("Nota valida");

        }if (numero >=8){
            System.out.println("Numero A");
        } else if (numero>=4) {
            System.out.println("Numero B");
        } else if (numero>=2) {
            System.out.println("Numero c" );

        }
    }
}
