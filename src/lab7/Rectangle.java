package lab7;

public class Rectangle extends Figure{
    private double W;
    private double L;


    public Rectangle(double W,double L){
        this.W=W;
        this.L=L;
    }

    public double getL() {
        return L;
    }

    public double getW() {
        return W;
    }


    double getArea() {
        return W*L;
    }


    double getPerimeter() {
        return 2*(W+L);
    }
    public String getName(){
        return "Rectangle";
    }
}
