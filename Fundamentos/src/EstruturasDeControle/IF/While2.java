package EstruturasDeControle.IF;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dizer = "";

        System.out.println("Coloque a palavra");


        while(!dizer.equalsIgnoreCase("sair")){
            System.out.println("Caso queira sair coloque :" + "Sair");
            dizer = entrada.next();
        }
    }
}
