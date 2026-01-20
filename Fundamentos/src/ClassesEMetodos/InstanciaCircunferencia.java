package ClassesEMetodos;

public class InstanciaCircunferencia {

    double raio;
    double pi;

    InstanciaCircunferencia(double raioInicial){
        raio = raioInicial;
        pi = 3.14;
    }

    double area(){
        return pi * Math.pow (raio, 2);
    }
}
