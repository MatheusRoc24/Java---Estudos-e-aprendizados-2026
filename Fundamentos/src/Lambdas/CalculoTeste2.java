package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class CalculoTeste2 {

    public static void main(String[] args) {


    //int -> Double não da
        //double -> Double consegue
        //Significa que quando aplicamos a função BinaryOperator se colocar 1 e não 1.00 ele vai informar erro

     BinaryOperator<Double> calc = (x, y) -> {return x + y;};
        System.out.println(calc.apply(40.0, 20.0));

        BinaryOperator<Integer> calc2 =( x,  y) -> {return x * y;};
        System.out.println(calc2.apply(4, 7));


    }
}


