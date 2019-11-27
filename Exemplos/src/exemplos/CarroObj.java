package exemplos;

public class CarroObj {

    public static void main(String[] args) {
        Carros meuCarro; //variável meuCarro é do tipo Carros
        meuCarro = new Carros(); //criando um novo objeto

        Carros novoCarro;
        novoCarro = new Carros(2010, "Fiat");

        meuCarro.placa = "ABC-1234";
        meuCarro.anoDeFabricacao = 2010;

        System.out.println("A placa do carro é " + meuCarro.placa);
        
    }
}