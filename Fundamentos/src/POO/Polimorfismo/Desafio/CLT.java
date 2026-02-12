package POO.Polimorfismo.Desafio;

public class CLT extends Funcionario {
    double salarioBase;
    double bonus;

    public CLT(String nome, int identificador, double salarioBase, double bonus) {
        super(nome, identificador);
        this.bonus = bonus;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

