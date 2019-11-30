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
        
        System.out.println("-----------------------");
        System.out.println("Dados Professor");
        Professor p1 = new Professor();
        p1.setNome("Maria");
        p1.setIdade(45);
        p1.setSexo("F");
        p1.setEspecialidade("História");
        p1.setSalario(5000.80f);
        System.out.println(p1.toString());
        
        System.out.println("-----------------------");
        System.out.println("Dados Aluno Técnico");
        AlunoTecnico at = new AlunoTecnico();
        at.setNome("Roberto");
        at.setIdade(18);
        at.setSexo("M");
        System.out.println(at.toString());
        
        
        
        
    }
    
}
