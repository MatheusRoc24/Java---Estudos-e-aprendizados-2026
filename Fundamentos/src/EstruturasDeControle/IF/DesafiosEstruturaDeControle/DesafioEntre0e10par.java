package EstruturasDeControle.IF.DesafiosEstruturaDeControle;

import java.util.Scanner;

public class DesafioEntre0e10par {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int verificar;

        System.out.println("Coloque seu numero");
        numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            System.out.println("Numero par");

        }
        if (numero !=0) {
            System.out.println("Impar");

        } else {
            System.out.println("Erro");
        }


    }
}


