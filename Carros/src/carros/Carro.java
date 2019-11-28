
package carros;

import java.util.Queue;

public class Carro {
    //Atributos
    private String marca;
    private int anoModelo;
    public static int quantidadeDeCarros;
    
    //Construtor
    Carro(){
        Carro.quantidadeDeCarros = Carro.quantidadeDeCarros + 1;
    }
    
    //Métodos de leitura e escrita para os atributos private

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnoModelo(int ano) {
        this.anoModelo = ano;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAnoModelo() {
        return this.anoModelo;
    }
    
    //Método de leitura para o atributo static
    public static int getQuantidadeDeCarros(){
        return Carros.quantidadeDeCarros;        
    }
    
    
    
}
