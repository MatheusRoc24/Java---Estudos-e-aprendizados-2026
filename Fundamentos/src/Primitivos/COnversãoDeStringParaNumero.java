package Primitivos;

import javax.swing.*;

public class COnversãoDeStringParaNumero {
    public static void main(String[] args) {

        String Valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");

        String Valor2 = JOptionPane.showInputDialog("Digite o segundo numero");

        //Apenas mostrara o valor de String;
        System.out.println(Valor1 + Valor2);

        double numero1 = Double.parseDouble(Valor1);
        double numero2 = Double.parseDouble(Valor2);

        //Agora o valor da soma
        double soma = numero1 + numero2;
        System.out.println(soma);
    }
}
