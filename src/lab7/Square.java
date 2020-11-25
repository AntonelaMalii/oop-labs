package lab7;

import static java.lang.Math.pow;

public class Square extends Figure {
    private double a;

    public Square(double a){
        this.a=a;
    }

    public double getA() {
        return a;
    }


    double getPerimeter() {
        return 4*a;
    }


    double getArea() {
        return a*a;
    }
    public String getName(){
       return "Square";
    }
}
