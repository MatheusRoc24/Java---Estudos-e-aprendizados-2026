package Erray.Desafios.Erray;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calculo = 0;
        double media;
        int medirTemp = 0;


        //Solicita o numero de dias para usuario;

        System.out.println("Coloque quantos dias quer registrar");
        int qntTemperatura = entrada.nextInt();

        //variavel em array que adiciona na quantidade de dias;

        double[] dia = new double[qntTemperatura];

        //Repetição até chegar ao valor correto

        for(int  i = 0 ; i < dia.length; i++){


            System.out.println("Coloque a temperatura de cada dia");
            dia[i] = entrada.nextDouble();
            System.out.println("Dia: " + (i+1));

            calculo += dia[i];



        }

        media = calculo / dia.length;
        System.out.println("A média dos dias é : " + media);


        for(int i = 0; i < dia.length; i++){
            if(dia[i] > media  ){
              medirTemp++;

            }
        }
        System.out.println("Dias acima da media:" + medirTemp);
    }
}
