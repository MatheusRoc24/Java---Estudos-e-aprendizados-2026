package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    String escrita= " ";

        do{
            System.out.println("Palavras magicas?...");
            escrita = entrada.nextLine();
        }while(!escrita.equalsIgnoreCase("por favor"));
    }
}
