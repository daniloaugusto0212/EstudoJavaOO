package exemplos;

import java.util.PriorityQueue;
import java.util.Queue;


public class Fila {

    
    public static void main(String[] args) {
       Queue cliente = new PriorityQueue();
       
        //Instanciando novos clientes e adicionando na fila
        cliente.offer(new Pessoas("Maria"));
        cliente.offer(new Pessoas("João"));

        //Enquanto estiver cliente na fila, imprima par ao usuário
        while (cliente.size() > 0){

            //imprimindo objeto para o usuário 
            System.out.println(cliente.poll());
        }
        
        
}
}
