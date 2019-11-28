package exemplos;

import java.util.ArrayList;
import java.util.Iterator;



public class Produto {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ArrayList <Integer> produto = new ArrayList();
        
        //Inserção dos produtos na coleção
        produto.add(12259);
        produto.add(21);
        produto.add(349);
        produto.add(21);
        produto.add(34798);
        
        //Percorrendo a coleção e imprimindo as informações
        Iterator inf = produto.iterator();
        while(inf.hasNext());
        System.out.println(inf.next());
        
        //Acessando por meio de um índice específico
        System.out.println(produto.get(349));
        
        
}
}