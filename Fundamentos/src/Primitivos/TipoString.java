package Primitivos;

public class TipoString {

    public static void main(String[] args) {

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}