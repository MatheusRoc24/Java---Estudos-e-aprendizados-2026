package Collections;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        conjunto.add("teste");
        System.out.println("Tamanho " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));

        System.out.println(conjunto.contains("teste"));

        Set number = new HashSet();

        number.add("Teste");

        number.add(2);
        number.add(3);

        System.out.println(number);

        conjunto.addAll(number);
        System.out.println(conjunto);

        conjunto.retainAll(number);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
