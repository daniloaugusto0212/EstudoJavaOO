
package contabanco;

class ContaCorrente {
    protected Clientes nome;
    private int numeroDaConta;
    private double saldoDisponivel = 0;
    String setNome;
    
    public void Sacar(double valor){        
        this.saldoDisponivel = saldoDisponivel -valor;
    }
    public void Depositar(double valor) {
        this.saldoDisponivel = saldoDisponivel + valor;
    }
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public int setNumeroDaConta(int numero) {
        return this.numeroDaConta = numero;
    }
       

    public Clientes getNome() {
        return nome;
    }

    public void setNome(Clientes nome) {
        this.nome = nome;
    }
    public void status(){
        System.out.println("Nome: " + setNome);
        System.out.println("Conta Corrente: " + numeroDaConta);
        System.out.println("Saldo disponível: " + saldoDisponivel);
    }
       
    
    
    
}
