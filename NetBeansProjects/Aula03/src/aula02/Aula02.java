
package aula02;
public class Aula02 {    
    public static void main(String[] args) {
        System.out.println("Modelo 1");
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; atributo privado, não aceita alteração.
        c1.carga = 80;  //atributo portegido, somente pode ser usado dentro da classe
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
