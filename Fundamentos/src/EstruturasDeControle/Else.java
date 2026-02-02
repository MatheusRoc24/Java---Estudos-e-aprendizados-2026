package EstruturasDeControle;

import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("Seu numero é par");
        }else{
            System.out.println("Seu numero é impar");
        }
    }
}
