package StreamAPIs.DESAFIOMAP1;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DESAFIOMAP1 {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream().map(Integer::toBinaryString)
                .map(s -> new StringBuilder(s).reverse().toString()).map(f-> String.format("%4s", f).replace(' ', '0'))
                .map(i -> Integer.parseInt(i,2)).forEach(System.out::println);




    }


}
