package exemplos;

import java.util.HashSet;
import java.util.Iterator;

public class Pessoas2 {

    public static void main(String[] args) {
        
    
       HashSet <Pessoas> cliente = new HashSet <>();

       //adicionando com o auxílio dos métodos de Collectios
       cliente.add(new Pessoas("João"));
       cliente.add(new Pessoas("Maria"));

       //criando mais um cliente sem o auxílio de Colletctions
       Pessoas outroCLiente = new Pessoas ("Maria");
        Object outroCliente = null;

       //Verificação se já existe esse novo cliente na coleção cliente
       if(cliente.contains(outroCliente)){
           System.out.println("Cliente já cadastrado!");
       }

       //Verificar e imprimir o tamanho da coleção
        System.out.println("Tamanho da coleção é: " + cliente.size());
        
        //Percorrendo a coleção e imprimindo as informações
        Iterator<Pessoas> inf = cliente.iterator();
        while(inf.hasNext()){
            Pessoas infCliente = (Pessoas)inf.next();
            System.out.println(infCliente);
        }
       

       }

    
}
