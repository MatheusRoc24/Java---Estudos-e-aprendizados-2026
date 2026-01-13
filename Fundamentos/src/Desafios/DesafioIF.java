package Desafios;

import java.util.Scanner;

public class DesafioIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia;

        //Usuario que coloca
        System.out.println("Coloque o nome do dia(Segunda, por exemplo");
        dia = entrada.next();

        //Devolve a dia
        if("Domingo" .equalsIgnoreCase(dia)){
            System.out.println("1");
        } if("Segunda" .equalsIgnoreCase(dia)){
            System.out.println("2");
        }if("Terça" .equalsIgnoreCase(dia)) {
            System.out.println("3");
        }if("Quarta" .equalsIgnoreCase(dia)) {
            System.out.println("4");
        }if("Quinta" .equalsIgnoreCase(dia)) {
            System.out.println("5");
        }if("Sexta" .equalsIgnoreCase(dia)) {
            System.out.println("6");
        }if("Sabado" .equalsIgnoreCase(dia)) {
            System.out.println("7");
        }else{
            System.out.println("Não é caractere palavra");

        }
    }
}

