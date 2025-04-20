public class Circulo extends Geometria {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    public double area () {
        return 3.14 * this.raio * this.raio;
    }

    public double comprimento () {
        return 2 * 3.14 * this.raio;
    }
}
