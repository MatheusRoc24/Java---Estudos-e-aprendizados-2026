public class main {
    public static void main(String[] args) {

        System.out.println("Hello word");

        personagem p1 =new personagem();
        p1.nome = "Mario";
        p1.getHp();

        personagem p2 = new personagem();
        p2.nome = "Luigi";
        p2.getHp();


//Mario perdeu vida
        p1.colidir();
        
        System.out.println(p1.nome + " - " + p1.getHp());
        System.out.println(p2.nome + " - " + p2.getHp());

    }
}
