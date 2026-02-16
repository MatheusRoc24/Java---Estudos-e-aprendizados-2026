package Lambdas;

public class CalculoTESTE {
    public static void main(String[] args) {

        Calculo soma = new Soma();
        Calculo divisao = new Divisão();


        System.out.println(soma.executar(30, 4));
        System.out.println(divisao.executar(20, 10));
    }
}
