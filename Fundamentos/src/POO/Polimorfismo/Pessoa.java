package POO.Polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);

            if(getPeso() > 100){
                System.out.println("Nova Thais Carla");
            }else{
                System.out.println("Normal");
            }
    }

  public void comer (Comida comida){
        this.peso += comida.getPeso();
  }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0 ) {
            this.peso = peso;

        }

    }

}





