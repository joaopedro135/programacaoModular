public class ContaPoupanca extends ContaBancaria {
    private float taxaRendimento;

    public ContaPoupanca (String cliente, int numConta, float saldo, float taxaRendimento) {
        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public float getSaldo () {
        float saldoAtual = procuraSaldo();
        float saldoComRendimento = saldoAtual + (saldoAtual * taxaRendimento);
        alteraSaldo(saldoComRendimento);
        return saldoComRendimento;
    }
}
