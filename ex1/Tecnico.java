public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico (String nome, String email, int matricula, double bonusSalarial) {   //construtor com adicional de tecnico
        super(nome, email, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double procuraBonusSalarial () { //getBonusSalarial
        return this.bonusSalarial;
    }

    @Override
    public String exibeDados () {   //toString com adicional
        return super.exibeDados() + "Bonus salarial: " + this.bonusSalarial + "\n";
    }
}
