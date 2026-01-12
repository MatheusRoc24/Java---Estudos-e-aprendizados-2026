package imports;


import java.util.Scanner;

public class Import {
    public static void main (String [] args) {

    //Scanner x= new Scanner(); //São os imports de bibliotecas basicas e avançadas de Java
        int a;
        int soma;
        Scanner entrada = new Scanner(System.in);

        int b = entrada.nextInt();

        int c = entrada.nextInt();


        soma = c + b;

        System.out.println(soma);

        }
    }