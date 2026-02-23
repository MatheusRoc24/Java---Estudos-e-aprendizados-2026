package StreamAPIs;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimirObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lucas", "Matheus", "Ana");

        System.out.println("\nUsando Foreach");
      for(String nome: aprovados){
          System.out.println(nome);
        }

        System.out.println("\nUsando Iterator");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream");
        Stream<String> streams = aprovados.stream();
        streams.forEach(System.out::println);
    }
}
