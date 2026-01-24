package Erray;

import java.util.Arrays;

public class foreachh {
    public static void main(String[] args) {

        double [] notas = {4.7,5.8,4.9,9.1,8.4};
        for(int i = 0; i< notas.length; i++){
            System.out.println("Primeiro " + notas[i]);
        }

        for(double nota: notas){
            System.out.println("Segundo " + nota);
        }


    }
}