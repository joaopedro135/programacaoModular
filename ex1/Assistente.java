public class Assistente extends Funcionario {
    private int matricula;

    public Assistente (String nome, String email, int matricula) {  //construtor com adicional de assistente
        super(nome,email);
        this.matricula = matricula;
    }
    
    public int procuraMatricula () {    //getMatricula
        return this.matricula;
    }

    @Override
    public String exibeDados () {   //toString com adicional
        return super.exibeDados() + "Matricula: " + this.matricula + "\n";
    }
}
