
package exercicioaula02;

public class ExercicioAula02 {

    public static void main(String[] args) {
        
        System.out.println("Aparelho 1");
        Celular c1 = new Celular();
        c1.marca = "Apple";
        c1.modelo = "Iphone 7";
        c1.tamanhoTela = 5.4f;
        c1.espacoDeMemoria = 64;
        c1.status();
        c1.fazerLigacao();
        System.out.println("");
        
        System.out.println("Aparelho 2");
        Celular c2 = new Celular();
        c2.marca = "Sony";
        c2.modelo = "Z2";
        c2.tamanhoTela = 6.4f;
        c2.espacoDeMemoria = 128;
        c2.status();
        c2.enviarSms();
           
        
    }
    
}
