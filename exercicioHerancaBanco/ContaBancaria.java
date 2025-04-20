public abstract class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria (String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public boolean sacar (float saque) {
        if (saldo >= saque) {
            this.saldo -= saque;
            return true;
        }
        return false;
    }

    public void depositar (float deposito) {
        this.saldo += deposito;
    }

    public abstract float getSaldo ();

    public float procuraSaldo () {  //getSaldo
        return this.saldo;
    }

    public void alteraSaldo (float saldo) { //setSaldo
        this.saldo = saldo;
    }
}