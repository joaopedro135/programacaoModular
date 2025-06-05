package TratamentoNumeroString;

import java.util.Scanner;

public class VerificadorNumero {
    public static void VerificarNumero (String valorEntrada) throws ItsNotANumberException {
        try {
            Double.parseDouble(valorEntrada);
        } catch (NumberFormatException e) {
            throw new ItsNotANumberException(valorEntrada);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor qualquer: ");
        String valorEntrada = scanner.nextLine();
        try {
            VerificarNumero(valorEntrada);
            System.out.println("Numero valido");
        } catch (ItsNotANumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
        return;
    }
}
