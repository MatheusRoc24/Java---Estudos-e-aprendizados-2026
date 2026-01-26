package Erray;

import java.util.Arrays;

public class Erray {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[]{7.9, 4.6, 5.2};
        System.out.println(Arrays.toString(notasAlunoA));
        double total = (double)0.0F;

        for(int i = 0; i < notasAlunoA.length; ++i) {
            total += notasAlunoA[i];
        }

        System.out.println(Arrays.toString(notasAlunoA));
    }
}
