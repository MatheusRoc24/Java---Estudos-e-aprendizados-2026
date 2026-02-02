package EstruturasDeControle;

import java.util.Scanner;

public class Swicth {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String faixa;

        System.out.println("Coloque a cor de sua faixa");
        faixa = entrada.next();
        faixa = faixa.toLowerCase();

        switch(faixa){
            case"branca":
                System.out.println("Faz nem um ano que começou");
                break;
            case"amarela":
                System.out.println("Faz 1 ano que começou");
                break;
            case"azul":
                System.out.println("Faz 3 anos que começou");
                break;
            case"roxo":
                System.out.println("Faz 4 anos que começou");
                break;
            case"preta":
                System.out.println("Já é lider");
                break;
        }
    }
}
