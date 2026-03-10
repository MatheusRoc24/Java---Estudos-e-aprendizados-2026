package TratamentoDeErros;

public class CheckadaVSNaoCheckada {

    public static void main(String[] args) {
        try {
            geraErro();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
           geraErro2();
        }catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    //Erro nao checkado
    static void geraErro() {
        throw new RuntimeException("ocorreu um erro bem legal");

    }

    //Erro checkado e verificado
    static void geraErro2() throws Exception {
          throw new Exception("Erro 2");
        }
    }



