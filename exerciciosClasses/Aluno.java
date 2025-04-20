import java.util.Scanner;

public class Aluno {
    private int registro;
    private String nome;

    public Aluno (int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public int getRegistro () {
        return registro;
    }

    public String getNome () {
        return nome;
    }

    public void setRegistro (int registro) {
        this.registro = registro;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String toString () {
        return "Registro: " + this.registro + "\n" + "Nome: " + this.nome + "\n";
    }
}

class Disciplina {
    private int codigo;
    private String nome;
    private double valor;

    public Disciplina (int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo () {
        return codigo;
    }

    public String getNome () {
        return nome;
    }

    public double getValor () {
        return valor;
    }

    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public String toString () {
        return "Codigo: " + this.codigo + "\n" + "Nome: " + this.nome + "\n" + "Valor: " + this.valor + "\n";
    }
}

class Matricula {
    private int numero;
    private String data;
    private Aluno aluno;
    private Disciplina[] disciplinas;

    public Matricula (int numero, String data, Aluno aluno, Disciplina[] disciplinas) {
        this.numero = numero;
        this.data = data;
        this.aluno = aluno;
        this.disciplinas = disciplinas;
    }

    public int getNumero () {
        return numero;
    }

    public String getData () {
        return data;
    }

    public Aluno getAluno () {
        return aluno;
    }

    public Disciplina[] getDisciplina () {
        return disciplinas;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public void setData (String data) {
        this.data = data;
    }

    public void setAluno (Aluno aluno) {
        this.aluno = aluno;
    }

    public void setDisciplinas (Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double calculaTotalValor () {
        double calculaTotalValor = 0;
        for (Disciplina d : disciplinas) {              //enquanto existir um valor para ser colocado na variavel d a partir do vetor de disciplinas, ele realiza a tarefa
            if (d != null) {                            // confirmar
                calculaTotalValor += d.getValor();
            }
        }
        return calculaTotalValor;
    }

    public String toString () {
        return "Numero: " + this.numero + "\n" + "Data: " + this.data + "\n" + "Aluno: " + this.aluno + "\n" + "Disciplinas: " + this.disciplinas + "\n" + "Valor total: " + this.calculaTotalValor() + "\n";
    }
}

class Main {
    Aluno[] alunos;
    Disciplina[] disciplinas;
    Matricula[] matriculas;

    public Main (Aluno[] alunos, Disciplina[] disciplinas, Matricula[] matriculas) {
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.matriculas = matriculas;
    }

    public Aluno[] getAlunos () {
        return alunos;
    }   

    public Disciplina[] getDisciplinas () {
        return disciplinas;
    }

    public Matricula[] geMatriculas () {
        return matriculas;
    }

    public void setAlunos (Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setDisciplinas (Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setMatriculas (Matricula[] matriculas) {
        this.matriculas = matriculas;
    }

    public void cadastrarAluno (Aluno novoAluno) {
        Aluno[] vetorAtualizado = new Aluno[alunos.length + 1];
        for (int i = 0; i < alunos.length; i++)
            vetorAtualizado[i] = alunos[i];
        vetorAtualizado[alunos.length] = novoAluno;
        this.alunos = vetorAtualizado;
    }

    public Aluno encontrarRegistro (int registroProcurado) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getRegistro() == registroProcurado)
                return alunos[i];
        }
        return null;
    }

    public Matricula encontrarMatricula (int matriculaProcurado) {
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i].getNumero() == matriculaProcurado)
                return matriculas[i];
        }
        return null;
    }

    public Disciplina encontraDisciplina (int disciplinaProcurada) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i].getCodigo() == disciplinaProcurada)
                return disciplinas[i];
        }
        return null;
    }

    public void menuInterface () {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU CONTA ===");
            System.out.println("1 - Cadastrar alunos");
            System.out.println("2 - Procurar alunos");
            System.out.println("3 - Procurar matricula");
            System.out.println("4 - Procurar disciplina");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
            }
        } while (opcao != 5);
        scanner.close();
    }
}



