package OperadoresLogicos;

import javax.swing.*;

public class DesafiosLogicos {
    public static void main(String[] args) {

    boolean trabalho = true;
    boolean trabalho1 = false;


// Primeira parte
     boolean ComprouTV50= (trabalho1 && trabalho);
        System.out.println("Comprou a tv de 50? " + ComprouTV50);

        //segunda parte

        boolean ComprouTV32 = (trabalho1 ^ trabalho);
        System.out.println("Comprou a tv de 32?" + ComprouTV32);
        boolean sorvete32 = (trabalho ^ trabalho);

        boolean Sorvete = ( ComprouTV32 ^ ComprouTV50);
        System.out.println("Foram tomar sorvete?" + Sorvete);


    }
}
