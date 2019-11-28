
package contabanco;


public class ContaBanco {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        
        conta.setNome = "Danilo";
        conta.setNumeroDaConta(1234);

        conta.Sacar(500.0);
        conta.Depositar(1000.0);
        conta.status();
    
}
}
