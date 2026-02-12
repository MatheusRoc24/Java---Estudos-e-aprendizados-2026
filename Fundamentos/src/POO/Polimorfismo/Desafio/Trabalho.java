package POO.Polimorfismo.Desafio;

public class Trabalho {
    public static void main(String[] args) {
       Funcionario p1 = new CLT("Matheus", 12, 8000, 1400);
       Funcionario p2 = new PJ("Lucas", 8, 4000);
       Funcionario p3 = new Freeelancer("Mariana", 7, 12,12,14.5);

        System.out.println(p1.calcularSalario());
        System.out.println(p2.calcularSalario());
        System.out.println(p3.calcularSalario());


    }



}
