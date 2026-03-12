package TratamentoDeErros.Personalizada;


@SuppressWarnings("serial")
public class NumeroVazioException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroVazioException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("o %s está negativo", nomeDoAtributo);
    }

    }

