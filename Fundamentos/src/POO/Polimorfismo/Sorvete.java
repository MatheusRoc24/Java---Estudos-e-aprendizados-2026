package POO.Polimorfismo;

public class Sorvete {
    private double peso = 4;

    public Sorvete(double peso){
        setPeso(peso);
    }

    public double getPeso(){
        return peso;

    }
    public void setPeso(double peso){
        if(peso >= 0){
            this.peso = peso;
        }
    }

}
