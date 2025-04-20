public class Funcionario {
    private String nome;
    private String email;

    public Funcionario (String nome, String email) {    //Construtor
        this.nome = nome;
        this.email = email;
    }

    public String procuraNome () {  //getNome
        return this.nome;
    }

    public String procuraEmail () { //getEmail
        return this.email;
    }

    public void alteraNome (String nome) {  //setNome
        this.nome = nome;
    }

    public void alteraEmail (String email) {    //setEmail
        this.email = email;
    }

    public String exibeDados () {   //toString
        return "Nome: " + this.nome + "\nEmail: " + this.email + "\n";
    }
}