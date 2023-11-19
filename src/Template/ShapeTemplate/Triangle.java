package Template.ShapeTemplate;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void getArea() {
        double area=base*height/2;
        System.out.println("Area of the Triangle is: "+area);
    }

    @Override
    public void getSides() {
        System.out.println("Triangle has 3 sides");
    }
}
