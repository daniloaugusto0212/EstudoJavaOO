package sobreheranca;

/**
 *
 * @author o1234
 */
public class SobreHeranca {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa;
        System.out.println("Dados Visitante");
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("-----------------------");
        System.out.println("Dados Aluno");
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(01);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        System.out.println("-----------------------");
        System.out.println("Dados Bolsista");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(02);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
