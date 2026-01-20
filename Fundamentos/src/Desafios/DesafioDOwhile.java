package Desafios;

import java.util.Scanner;

public class DesafioDOwhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int digitado = 0;

        do {
            System.out.println("Coloque o numero");
            digitado = entrada.nextInt();
            if(digitado < 0){
                System.out.println("Coloque um valor positivo");

            }else{
                System.out.println("Correto valor");
            }


        } while (digitado < 0);
    }
}