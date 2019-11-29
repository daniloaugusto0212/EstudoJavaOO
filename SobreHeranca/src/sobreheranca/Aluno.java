package sobreheranca;

public /*final*/ class Aluno extends Pessoa { //final não deixa a classe ter filhos, como acontece em Bolsista
    private int matricula;
    private String curso;
    public /*final*/ void pagarMensalidade(){ //final não deixa a classe ser sobreposta, como acontece em Bolsista
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
