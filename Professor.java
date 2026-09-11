package funcionarios;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, double salario, String disciplina){
        super(nome, salario);


    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina=disciplina;

    
}
    @Override
    public void exibirInfo(){
        System.out.println("Disciplina: " + disciplina);
    }
}


