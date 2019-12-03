
package cadastrodeprodutos;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Comida {
    private String nome;
    private double valor;
    private Date dataFabricacao;
    private int diasValidade;
    Calendar calendar = Calendar.getInstance();
    
    //Construtor comida

    public Comida(String nome, double valor, Date data, int dias) {
        this.nome = nome;
        this.valor = valor;
        this.dataFabricacao = data;
        this.diasValidade = dias;
    }
    //Método para verificar se a comida está vencida
    public boolean estaVencido()throws ComidaVencidaException{
        Date dataAtual = calendar.getTime();
        calendar.setTime(this.dataFabricacao);
        calendar.add(Calendar.DAY_OF_MONTH, diasValidade);
        Date dataProdutoComValidade = calendar.getTime();
        if(dataProdutoComValidade.after(dataAtual)){
            return false;
        }else{
            throw new ComidaVencidaException();
        }
    }
    //Método Gets

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public int getDiasValidade() {
        return diasValidade;
    }

    
    
    

}
