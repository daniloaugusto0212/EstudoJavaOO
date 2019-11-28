
package cadastroclientes;

public class Pessoas {
    private int contato;
    private String nomeCliente;
    private static int totalDeClientes; //Atributo da classe
    
       
    //Métodos
    Pessoas(){
        Pessoas.totalDeClientes = Pessoas.totalDeClientes + 1;
    }

    public static int getTotalDeClientes() {
        return Pessoas.totalDeClientes;
    }

    public int getContato() {
        System.out.println("Digite o número de contato: ");
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void status(){
        System.out.println("Contato: " + contato);
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Total de clientes: " + totalDeClientes);
    }
    
    
    
}
