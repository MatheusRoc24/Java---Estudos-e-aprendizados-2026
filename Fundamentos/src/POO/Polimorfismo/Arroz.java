package POO.Polimorfismo;

public class Arroz extends Comida {
    private double peso = 4;

    @Override
    public Arroz(double peso){
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


