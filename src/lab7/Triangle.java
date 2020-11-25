package lab7;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c ){
        this.a=a;
        this.b=b;
        this.c=c;

    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    double getArea() {
        double p;
        p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }


    double getPerimeter() {
        return a+b+c;
    }

    public String getName(){
        return "Triangle";
    }
}
