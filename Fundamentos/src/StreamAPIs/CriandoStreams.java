package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> prints = System.out::println;
        Consumer<Integer> println  = System.out::println;

        System.out.println("Via stream");
        Stream<String> langs = Stream.of("\nJava", "Lua" , "JavaScript" );
        langs.forEach(prints);

        System.out.println("Part 2");
        String[] maisLangs = {"\nPyhton", "Cobol"};
        Stream.of(maisLangs).forEach(prints);
        Arrays.stream(maisLangs , 1, 2).forEach(prints);

        System.out.println("Parte 3");
        List<String> outrasLang = Arrays.asList("\nC++", "Cotlin", "Ruby");
        outrasLang.stream().forEach(prints);
        outrasLang.parallelStream().forEach(prints);


        //Stream.generate(() -> "1").forEach(prints);
        Stream.iterate(0, n->n + 1).forEach(println);
    }


}
