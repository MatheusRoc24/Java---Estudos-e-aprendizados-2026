package StreamAPIs.DESAFIOFILTER1;

import StreamAPIs.aLunoFiltros;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface LambdaProduto {
    Predicate<Produto>valido = a -> a.desconto >= 0.3 && a.isFreteGratis();
    Function<Produto, String> pode= a-> " Produto disponivel para desconto e frete grátis : \n " + a.getNome () + " Preço " + a.getPreco () + " Desconto de "+ a.getDesconto ();

}
