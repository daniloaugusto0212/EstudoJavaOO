
package exercicioaula02;

public class Celular {
    //atributos
    String marca, modelo;
    float tamanhoTela;
    int espacoDeMemoria;  
    boolean ligado;
    
//método
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tela: " + this.tamanhoTela);
        System.out.println("Memória: " + this.espacoDeMemoria);
        System.out.println("Ligado? " + this.ligado);
    }
    //métodos
    void fazerLigacao(){
        if (ligado == false) {
            System.out.println("Não é possível fazer uma ligação!");
        }else{
            System.out.println("Pode fazer a ligação!");
        }        
    }
    void enviarSms(){
        if (ligado == false) {
            System.out.println("Não é possível enviar um SMS!");
        }else{
            System.out.println("Pode enviar um SMS.");
        }
    }
    void ligado(){
        this.ligado = true;
    }
    void desligado(){
        this.ligado = false;
    }
    

}
