package TratamentoFatorial;

public class Fatorial {
    public static int calcularFatorial (int arg) throws NumNegativoException {
        if (arg < 0) {  
            throw new NumNegativoException(arg);
        } else {
            int somatorio = 1;
            for (int i = 2; i <= arg; i++) {
                somatorio *= i;
            }
            return somatorio;
        }
    }
}
