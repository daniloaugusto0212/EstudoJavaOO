package sobrepolimorfismo;
public class SobrePolimorfismo {
    public static void main(String[] args) {
        //Animal n = new Animal();  //Animal é um método abstrato, não pode ser instanciado. Serve somente para usar nas classes
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
                
        

        System.out.println("------------------");
        System.out.println("=-=-=-= Mamífero =-=-=-=-=\n");
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println("    ------------------");
        System.out.println("    ----- Canguru -----\n");
        c.locomover();
        c.usarBolsa();
        
         System.out.println("    ------------------");
        System.out.println("    ----- Cachorro -----\n");
        k.locomover();
        k.emitirSom();
        
        
        
        
        
        
        
        
    }
    
}
