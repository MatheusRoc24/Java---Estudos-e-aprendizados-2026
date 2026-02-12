package POO.Polimorfismo.Desafio;

public class Freeelancer extends Funcionario{
    double horasTrabalhadas;
    double diasTrabalhados;
    double pagamentoHora;

    public Freeelancer(String nome, int identificador, double horasTrabalhadas, double diasTrabalhados, double pagamentoHora) {
        super(nome, identificador);
        this.diasTrabalhados = diasTrabalhados;
        this.horasTrabalhadas = horasTrabalhadas;
        this.pagamentoHora = pagamentoHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * diasTrabalhados*pagamentoHora;
    }
}
