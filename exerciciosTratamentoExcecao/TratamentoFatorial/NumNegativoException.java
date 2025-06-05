package TratamentoFatorial;

public class NumNegativoException extends Exception{
    public NumNegativoException (int arg) {
        super ("Numero invalido: " + arg);
    }
}
