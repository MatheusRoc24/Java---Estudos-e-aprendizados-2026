package POO.Polimorfismo.Desafio;

public class PJ extends Funcionario {

    double contrato;
    public PJ(String nome, int identificador, double contrato) {
        super(nome, identificador);
        this.contrato = contrato;
    }

    @Override
    public double calcularSalario() {
        return contrato;
    }
}
