import java.util.Scanner;

public class TratamentoExcecaoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int[] vetorDivisores = new int[10];
        int quantidadeDivisores = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                try {
                    if (quantidadeDivisores > 9) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    vetorDivisores[quantidadeDivisores] = i;
                    quantidadeDivisores++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Erro: Estouro de limite do array");
                    scanner.close();
                    return;
                }
            }
        }
        scanner.close();
        System.out.println("Divisores encontrados:");
        for (int i = 0; i < quantidadeDivisores; i++) {
            System.out.println(vetorDivisores[i] + " ");
        }
    }
}
