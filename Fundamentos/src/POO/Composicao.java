package POO;

public class Composicao {

    double fatorInjecao = 1;
    boolean ligado = true;

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int)Math.round(fatorInjecao * 3000) ;
        }
    }
}
