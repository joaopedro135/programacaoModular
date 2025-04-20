public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo (String nome, String email, int matricula, String turno, double adicionalNoturno) {   //construtor com adicionais de adminsitrativo
        super(nome, email, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String procuraTurno () { //getTurno
        return this.turno;
    }

    public double procuraAdicionalNoturno () {  //getAdicionalNoturno
        return this.adicionalNoturno;
    }

    @Override
    public String exibeDados () {   //toString com adicional
        return super.exibeDados() + "Turno: " + this.turno + "\nAdicional noturno: " + this.adicionalNoturno + "\n";
    }
}
