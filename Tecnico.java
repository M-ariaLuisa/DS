package funcionarios;

public class Tecnico extends Funcionario {
    private String setor;

    public Tecnico(String nome, double salario, String setor){
        super(nome, salario);
    }

    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor=setor;
    }
    @Override
    public void exibirInfo(){
        System.out.println("Setor: + setor");
    }

}
