package Template.ShapeTemplate;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape triangle=new Triangle(5,3);
        Shape circle=new Circle(6);
        Shape rectangle=new Rectangle(3,4);

        triangle.getArea();
        triangle.getSides();
        circle.getArea();
        circle.getSides();
        rectangle.getArea();
        rectangle.getSides();
    }
}
