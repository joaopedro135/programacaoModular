package TratamentoFatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para fazer o fatorial precisamos de um inteiro maior ou igual a 0: ");
        String entrada = scanner.nextLine();
        try {
            if (entrada.isEmpty()) {
                throw new StringVaziaException("Ops! Entrada vazia");
            }
            int numInteiro = Integer.parseInt(entrada);
            int resultadoFatorial = Fatorial.calcularFatorial(numInteiro);
            System.out.println("O fatorial de " + numInteiro + " seria igual a " + resultadoFatorial);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumNegativoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
