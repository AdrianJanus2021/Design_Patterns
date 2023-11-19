package Template.CalculatorTemplate;

public class Sum extends Operation{
    double a;
    double b;

    public Sum(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double calculation() {
        return a+b;
    }
}
