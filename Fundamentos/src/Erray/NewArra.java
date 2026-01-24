package Erray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewArra {
    public static void main(String[] args) {

        double[] notasAlunoA =new double[3];
        notasAlunoA[0] = 4;
        notasAlunoA[1] = 2;
        notasAlunoA[2] = 6;

        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println(total /notasAlunoA.length);

        double[] notasAlunoB =  {4, 3 , 6 };
        System.out.println(Arrays.toString(notasAlunoB));
        double total2 = 0;
        for( int i = 0; i < notasAlunoB.length; i++){
            total2 += notasAlunoB[i];
        }
        System.out.println("notas b " + total2 / notasAlunoB.length);
    }
}
