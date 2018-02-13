class AreaOfShape
{
    public int  area(int l,int b)
    {
        return l*b;
    }
    public  float area(float r){
        return r*r;
        //return Math.PI(r*r);
    }
    public double area(int b , double h){
        return 0.5*b*h;
    }
}

//Method Overloading---same method name with different parameters

public class Polyloading {
    public static void main(String[] args)
    {
        AreaOfShape ar = new AreaOfShape();
        System.out.println("Area of Circle" + ar.area(2.2f));
        System.out.println("Area of a Rectangle" + ar.area(4,5));
        System.out.println("Area of Triangle" + ar.area(3,6.6));
    }
}
