package Collections;

import java.util.ArrayList;

public class ListObject {
    public static void main(String[] args) {

        ArrayList<ClassLIst> lista = new ArrayList<>();

        ClassLIst a1 = new ClassLIst("Barbara");

        lista.add(a1);
        lista.add(new ClassLIst(("Carlos")));
        lista.add(new ClassLIst("Bia"));
        lista.add(new ClassLIst("Juan"));

        System.out.println(lista.get(3));

        for(ClassLIst u : lista){
            System.out.println(u.toString());
        }

        System.out.println(lista.remove(1));
        System.out.println(lista.remove(new ClassLIst("Manu")));

        System.out.println(lista.contains(new ClassLIst("Carlos")));
        System.out.println("Tem?" + ClassLIst.contains(a1));

    }
}
