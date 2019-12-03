
package cadastrodeprodutos;



public class ComidaVencidaException extends Exception{
    
    @Override
    public String getMesssage(){
        return "Está vencida";
    }

}
