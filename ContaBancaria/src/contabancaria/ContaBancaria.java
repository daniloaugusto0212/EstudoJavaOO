
package contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {
    
        System.out.println("Abertura de Conta");
        ContaBanco p1 = new ContaBanco();
        p1.numConta = 1111;
        p1.dono = "Jubileu";
        p1.abrirConta ("CC");
        
        
        
        System.out.println("");
        ContaBanco p2 = new ContaBanco();
        p2.numConta = 222;
        p2.dono = "Creuza";
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.fecharConta();
        
        p1.resumo();
        p2.resumo();
            
    }
    
}
