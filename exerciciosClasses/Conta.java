import java.util.Scanner;

public class Conta {

    private int numero;
    private float saldo;

    public Conta (int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero () {
        return numero;
    }

    public float getSaldo () {
        return saldo;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public void setSaldo (float saldo) {
        this.saldo = saldo;
    }

    public void depositar (float valor) {
        saldo += valor;
    }

    public void sacar (float valor) {
        saldo -= valor;
    }
}

class ContaInterface {
    public void menu (Conta conta) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        float valor;

        do {
            System.out.println("\n=== MENU CONTA ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Conferir Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor para deposito: ");
                    valor = scanner.nextFloat();
                    conta.depositar(valor);
                    break;

                case 2:
                    System.out.println("Valor para saque: ");
                    valor = scanner.nextFloat();
                    conta.sacar(valor);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}

class UsaMain {
    public static void main (String[] args) {
        Conta contaPessoal = new Conta(2024008643, 53);
        ContaInterface interfacePessoal = new ContaInterface();
        interfacePessoal.menu(contaPessoal);
    }
}
