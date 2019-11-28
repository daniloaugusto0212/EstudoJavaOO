
package exemplos;


public class Pessoas implements Comparable<Pessoas> {
    
    //Seus atributos
    public String nome, gênero;
    public int idade;
    public float peso, altura;
    
    public Pessoas(String nome){
        this.nome = nome;
    }
    public int comparateTo(Pessoas p){
        return this.nome.compareTo(p.nome);
    }
    public String toString(){
        return this.nome;
    }

    //Seu métodos
    public void andar(){
        //ações do método andar

    }
    public void falar(){
        //ações do método falar

    }
    public void comer(){
        //açõe do método comer
        
    }

    @Override
    public int compareTo(Pessoas o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
