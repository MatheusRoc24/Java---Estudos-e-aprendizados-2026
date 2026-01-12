package OperadoresAritimeticos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {


        int primeiro = (6*(3+2));
        int Eleva = (int) Math.pow(primeiro,2);
        int primeiraDiv = 3*2;
        int calculo = Eleva / primeiraDiv;
        System.out.println(calculo);

        int segundo = ((1-5)*(2-7)/2);
        int Eleva2 = (int) Math.pow(segundo,2);
        System.out.println(Eleva2);

        int calculo1 = calculo - Eleva2;
        int Eleva3 = (int) Math.pow(calculo1, 3);

        int constante = 10;
        int Eleva4 = (int) Math.pow(constante, 3);

        int finalquest = (Eleva3 / Eleva4);

        System.out.println("O resultado é " + finalquest);



    }
}
