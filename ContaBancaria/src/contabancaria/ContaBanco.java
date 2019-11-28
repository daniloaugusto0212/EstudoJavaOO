
package contabancaria;

public class ContaBanco {
   //Atributos
    public int numConta;
    protected String tipo;
    String dono;
    private float saldo;
    private boolean status;
    
     public void resumo(){
        System.out.println("------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.getStatus());
        
    }

    public ContaBanco() {
    }

    
    
    
    //Métodos Personalizados
    public void abrirConta(String tipo){
        this.tipo = tipo;
        this.status = true;
        if(tipo == "CC"){
            this.saldo = 50;
        }else if(tipo == "CP"){
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta não pode ser fechada, conta com dinheiro!");
        }else if (saldo < 0){
            System.out.println("Conta com débito");
        }else{
            this.status = false;
             System.out.println("Conta fechada com sucesso!");
        }
       
    }
    public void depositar(float valor){
        if(status == true){
            this.saldo += valor;
            System.out.println("Depósito realizado na conte de " + this.getDono());
        }else{
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(float valor){
        if(this.status == true){
            if (saldo >= valor){
               this.saldo -= valor;
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo Insuficiente");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
            
    }
    public void pagarMensalidade(){
        float valor = 0;
        if(tipo == "CC"){
            valor = 12;
        }else if(tipo == "CP"){
            valor = 20;
        }
        if(status == true){
            if(saldo > valor){
                this.saldo -= valor;
            }else{
                System.out.println("Saldo insufuciente");
            }
        }else{
            System.out.println("Impossível pagar");
        }
    }
        
    //Métodos especiais
    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   

    
    }

    
