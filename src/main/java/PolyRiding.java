class Shape
{
    public void area()
    {
        System.out.println("Area of a Shape");
    }
}
class Rectangle extends Shape
{
    public void area()
    {
        System.out.println(7*8);
    }
}
class Circle extends  Shape
{
    public void area()
    {
        System.out.println(Math.PI*3*3);
    }
}
class Triangle extends Shape{
    public void area()
    {
        System.out.println("Triangle area:"+(2*7*.5));
    }
}
public class PolyRiding {
    public static void main(String[] args) {
        // Shape obj = new Shape();
        // obj.area();

        Shape obj = new Circle();
        obj.area();

        obj = new Rectangle();
        obj.area();
    }
}
