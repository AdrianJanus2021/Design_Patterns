package Template.CalculatorTemplate;

public class Multiply extends Operation{
    double a;
    double b;

    public Multiply(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double calculation() {
        return a*b;
    }
}
