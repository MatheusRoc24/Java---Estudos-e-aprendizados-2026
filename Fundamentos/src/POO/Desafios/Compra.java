package POO.Desafios;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

   double calculoTotal(){
       double total = 0;

       for (Item i: itens){
           total +=i.quantidade * i.produto.preco;
       }
       return total;
   }


}
