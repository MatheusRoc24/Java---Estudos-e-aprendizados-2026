package ClassesEMetodos;

import ClassesEMetodos.DesafiosClassesEMetodos.Usuario;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario a1 = new Usuario();
        a1.nome = "Pedro";
        a1.email = "pedro@gmail.com";

        Usuario a2 = new Usuario();
        a2.nome = "Pedro";
        a2.email = "juliana@gmail.com";

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));

        System.out.println(a2.equals(new Date()));
        }

    }

