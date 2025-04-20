public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial (String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar (float saque) {
        float saldoAtual = procuraSaldo();
        if (saldoAtual + limite >= saque) {
            alteraSaldo(saldoAtual - saque);
            return true;
        }
        return false;
    }

    public float getSaldo () {
        return procuraSaldo();
    }
}
