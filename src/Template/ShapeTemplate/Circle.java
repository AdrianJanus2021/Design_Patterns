package Template.ShapeTemplate;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area=Math.PI*radius*radius;
        System.out.println("Area of the Circle is: "+area);
    }

    @Override
    public void getSides() {
        System.out.println("Circle has NO sides");
    }
}
