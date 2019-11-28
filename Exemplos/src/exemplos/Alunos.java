package exemplos;

import java.util.PriorityQueue;
import java.util.Queue;


public class Alunos {
    public static void main(String[] args) {
        
        //Adicionando alunos
        alunos.put(256,"João");
        alunos.put(547, "Maria");

        //Consultando se valor existe no HashMap
        String nomeAluno = alunos.get(547);

        //Removendo Dados
        Alunos.remove(547);

        //verificar se existe um aluno
        Boolean verificar = alunos.containskey(256);

        //Impressão para o usuário
        System.out.println(nomeAluno);

        if(verificar){
            System.out.println("Aluno existe");
        }
        //remove todos os itens existentes
        alunos.clear();


    }

    private static void remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
