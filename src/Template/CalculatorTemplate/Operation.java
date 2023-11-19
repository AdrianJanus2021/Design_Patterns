package Template.CalculatorTemplate;

public abstract class Operation {
    public abstract Double calculation();
    public final void display(){
        System.out.println(calculation());
    }
}
