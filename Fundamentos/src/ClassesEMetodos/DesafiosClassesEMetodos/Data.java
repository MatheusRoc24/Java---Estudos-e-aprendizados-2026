package ClassesEMetodos.DesafiosClassesEMetodos;

public class Data {

    int dia;
    int mes;
    int ano;

    String DadosData(){
        return String.format("%d/%d/%d",dia, mes, ano);
    }
    void RetorarData(){
        System.out.println(DadosData());
    }
}
