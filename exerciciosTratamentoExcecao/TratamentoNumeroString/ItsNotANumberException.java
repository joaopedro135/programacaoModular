package TratamentoNumeroString;

public class ItsNotANumberException extends Exception {
    public ItsNotANumberException(String valorEntrada) {
        super ("valor invalido: " + valorEntrada);
    }
}