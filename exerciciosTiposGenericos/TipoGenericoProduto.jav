public class TipoGenericoProduto implements Comparable<TipoGenericoProduto> {
    private Object codigo;
    private String nome;
    private float valor;

    public TipoGenericoProduto (int codigo, String nome, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public Object getCodigo () {
        return codigo;
    }

    public void setCodigo (Object codigo) {
        this.codigo = codigo;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public float getValor () {
        return valor;
    }

    public void setValor (float valor) {
        this.valor = valor;
    }

    public String toString () {
        return 
            "\nCodigo: " + this.codigo +
            "\nNome: " + this.nome +
            "\nValor: " + this.valor;
    }

    public int compareTo (TipoGenericoProduto outroProduto) {
        int comparacaoNome = this.nome.compareTo(outroProduto.getNome());
        int comparacaoValor = Float.compare(this.valor, outroProduto.getValor());
        if (comparacaoNome != 0) {
            return comparacaoNome;
        }
        return comparacaoValor;
    }
}