package Lambdas;

public class CalculoComLambdas {
    public static void main(String[] args) {

        Calculo calc = (x, y) -> {

          return x + y;

        };

        System.out.println(calc.executar(40, 20));
    }
}
