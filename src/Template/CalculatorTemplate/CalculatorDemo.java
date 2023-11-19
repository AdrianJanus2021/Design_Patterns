package Template.CalculatorTemplate;

public class CalculatorDemo {
    public static void main(String[] args) {
        Operation sum=new Sum(5,3);
        sum.display();
        Operation sub=new Subdivision(5,3);
        sub.display();
        Operation mul=new Multiply(5,3);
        mul.display();
        Operation div=new Division(5,3);
        div.display();
    }
}
