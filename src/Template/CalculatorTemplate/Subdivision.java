package Template.CalculatorTemplate;

public class Subdivision extends Operation {
    double a;
    double b;

    public Subdivision(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double calculation() {
        return a-b;
    }
}
