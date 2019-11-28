
package cadastroclientes;

public class CadastroClientes {

    public static void main(String[] args) {
        
        Pessoas cliente1 = new Pessoas();
        int totalPessoas = cliente1.getTotalDeClientes();
        cliente1.setContato(111999355);
        cliente1.setNomeCliente("Danilo");
        
        Pessoas cliente2 = new Pessoas();
        
        cliente1.status();
        cliente2.status();
    }
    
}
