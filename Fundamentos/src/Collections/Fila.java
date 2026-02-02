package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> ClassList = new LinkedList<>();

        //Offer e add -> adicionam elementos na fila
        //Diferença é o comportamento quando a fila está cheia

        ClassList.add("Ana");
        ClassList.offer("Bia");
        ClassList.add("Carlos");
        ClassList.offer("Dhennifer ");
        ClassList.add("Daniel");

        System.out.println(ClassList.peek());
        System.out.println(ClassList.peek());

        ClassList.poll();
        System.out.println(ClassList);
    }
}
