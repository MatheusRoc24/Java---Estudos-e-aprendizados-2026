package POO.herança.Desafio;

public class Carro {
    int VelocidadeAtual = 0;

    void acelerar(){
        VelocidadeAtual +=5;

    }

     void frear(){
        VelocidadeAtual -= 5;
        if(VelocidadeAtual < 0){
            VelocidadeAtual = 0;

        }
     }
    }


