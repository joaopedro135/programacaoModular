public class NumeroComplexo {

    private double parteInteira;
    private double parteImaginaria;

    public NumeroComplexo (double a, double b) {
        this.parteInteira = a;
        this.parteImaginaria = b;
    }
    
    public double getParteInteira () {
        return parteInteira;
    }

    public double getParteImaginaria () {
        return parteImaginaria;
    }

    public void setParteInteira (double a) {
        this.parteInteira = a;
    }

    public void setParteImaginaria (double b) {
        this.parteImaginaria = b;
    }

    public NumeroComplexo soma (NumeroComplexo z) {
        double somaParteInteira = this.parteInteira + z.getParteInteira();
        double somaParteImaginaria = this.parteImaginaria + z.getParteImaginaria();
        return new NumeroComplexo(somaParteInteira, somaParteImaginaria);
    }

    public NumeroComplexo produto (NumeroComplexo z) {
        double produtoParteInteira = this.parteInteira * z.getParteInteira() - this.parteImaginaria * z.parteImaginaria;
        double produtoParteImaginaria = this.parteImaginaria * z.getParteInteira() + this.parteInteira * z.getParteImaginaria();
        return new NumeroComplexo(produtoParteInteira, produtoParteImaginaria);
    }

    public NumeroComplexo conjugado () {
        return new NumeroComplexo(this.parteInteira, this.parteImaginaria * -1);
    }

    public String toString () {
        return this.parteInteira + " + " + this.parteImaginaria + "i";
    }

    public static void main(String[] args) {
        NumeroComplexo Z = new NumeroComplexo(2, 3);
        NumeroComplexo W = new NumeroComplexo(4, 5);
        NumeroComplexo X = Z.soma(W);
        System.out.println(Z + " + " + W + " = " + X);
    }
}