import java.util.Scanner;

public class TratamentoExcecaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = null;
        String string2 = null;

        try {
            String input1 = scanner.nextLine();
            if (!input1.isEmpty()) {                     //condição do if: Se a string não estiver vazia, então guarde a info em string1
                string1 = input1;                        //Metódo necessário pois o scanner.nextline() nunca retorna null
            }                                            //Então para reconhecer a exceção NullPointerException é preciso contornar este problema
            String input2 = scanner.nextLine();
            if (!input2.isEmpty()) {
                string2 = input2;
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: String nula");
        }
    }
}