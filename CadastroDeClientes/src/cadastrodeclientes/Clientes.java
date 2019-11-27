
package cadastrodeclientes;

public class Clientes {
    //Atributos
    public String nome, endereco;
    public int idade, contato;

    //Construtos com 2 parâmetros
    public  Clientes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos sem retorno
    public void setContatoCliente(int contato) {
        this.contato = contato;
    }
    public void setEnderecoCliente(String endereco) {
        this.endereco = endereco;
    }

    //Métodos com retorno
    public String getNomeDoCliente() {
        return nome;
    }
    public int getIdadeDoCliente() {
        return idade;
    }
    public int getContatoDoCliente() {
            return contato;
    }
    public String getEnderecoDoCliente() {
        return endereco;
    }
    
}
