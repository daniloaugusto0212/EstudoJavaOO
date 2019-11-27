
package cadastrodeclientes;

public class CadastroDeClientes {

    public static void main(String[] args) {
        Clientes novoCliente;
        novoCliente = new Clientes("Maria", 20);

        //Passando as informações restantes sobre o cliente
        novoCliente.setEnderecoCliente("Rua Luis Sagrado, 147");
        novoCliente.setContatoCliente(1199995555);

        //Imprimindo ao usuário
        System.out.println("Nome:" + novoCliente.getNomeDoCliente());
        System.out.println("Idade: " + novoCliente.getIdadeDoCliente());
        System.out.println("Contato: " +novoCliente.getContatoDoCliente());
        System.out.println("Endereço: " + novoCliente.getEnderecoDoCliente());
    }
    
}
