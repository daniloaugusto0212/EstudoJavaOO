package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {
    public static void main(String[] args) {
        
        System.out.println("\n----------Cachorro---------\n");
        Cachorro c = new Cachorro();
        //testando os métodos
        c.reagir("Olá");
        c.reagir("Vai Apanhar");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        
       
        
        
    }
    
}
