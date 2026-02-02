package EstruturasDeControle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua media: ");
        double media = entrada.nextDouble();

        if(media >=6){
            System.out.println("Passou");
        }
        if (media < 7 && media >= 4.5){
            System.out.println("recuperação");
        }

        boolean criterioReporvaçãoAtingido = media < 4.5 && media >=0;
        if(criterioReporvaçãoAtingido){
            System.out.println("Reprovado");
        }
    }
}
