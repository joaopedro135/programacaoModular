package TratamentoString;
import java.util.Scanner;

public class TratamentoExcecaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1;
        String input2;
        input1 = scanner.nextLine();
        input2 = scanner.nextLine();
        try {
            if (input1.isEmpty() || input2.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: String nula");
            return; 
        } finally {
            scanner.close();
        }
        if (input1.length() > input2.length()) {
            System.out.println("A primeira string é maior que a segunda.");
        } else if (input1.length() < input2.length()) {
            System.out.println("A segunda string é maior que a primeira.");
        } else {
            System.out.println("As strings têm o mesmo tamanho.");
        }
    }
}