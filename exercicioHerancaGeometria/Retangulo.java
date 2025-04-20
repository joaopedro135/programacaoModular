public class Retangulo extends Geometria {
    private double largura;
    private double altura;

    public Retangulo (double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area () {
        return altura * largura;
    }
    
    public double comprimento () {
        return 2 * (altura + largura);
    }
}
