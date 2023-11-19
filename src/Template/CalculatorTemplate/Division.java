package Template.CalculatorTemplate;

public class Division extends Operation{
    double a;
    double b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double calculation() {
        if (b!=0) {
            return a / b;
        }
        else return null;
    }
}
