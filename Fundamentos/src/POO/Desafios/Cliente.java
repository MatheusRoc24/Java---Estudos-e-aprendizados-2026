package POO.Desafios;


import java.util.ArrayList;

public class Cliente {


    String nomeCliente;

    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nomeCliente) {

        this.nomeCliente = nomeCliente;
    }

    void adicionarCompras(Compra compra) {
        compras.add(compra);
    }

    double calculoTotal() {
        double total = 0;

        for (Compra c : compras) {
            total += c.calculoTotal();
        }

        return total;
    }
}