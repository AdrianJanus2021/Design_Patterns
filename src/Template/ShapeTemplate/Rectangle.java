package Template.ShapeTemplate;

public class Rectangle extends Shape{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        double area=a*b;
        System.out.println("Area of the Rectangle is: "+area);

    }

    @Override
    public void getSides() {
        System.out.println("Rectangle has 4 sides");
    }
}
