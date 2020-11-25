package lab7;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Figure Circle = new Figure(){
            double rad=10.5;

            public double getArea(){
                return (Math.PI)*rad*rad;
            }
            public double getPerimeter(){
                return 2*(Math.PI)*rad;
            }
            public String getName(){
              return "Circle";
            }

        };

        Square square = new Square(7.5);
        Rectangle rectangle = new Rectangle(24,4);
        Triangle triangle = new Triangle(5,7,10);

        Figure[] list=new Figure[4];
        list[0]=square;
        list[1]=rectangle;
        list[2]=triangle;

        System.out.println("Figure 3 : "+ list[0].getName()+ " with aria " + list[0].getArea()+" and perimetrul "+ list[0].getPerimeter());
        System.out.println("Figure 2 : "+ list[1].getName()+ " with aria " + list[1].getArea()+" and perimetrul "+ list[1].getPerimeter());
        System.out.println("Figure 3 : "+ list[2].getName()+ " with aria " + list[2].getArea()+" and perimetrul "+ list[2].getPerimeter());
        System.out.println("\n");


        FigureController figureController0 = new FigureController();
        System.out.println("Biggest area: "+ figureController0.biggestArea(list).getName() + " with area " + figureController0.biggestArea(list).getArea());
        System.out.println("Biggest perimeter: "+ figureController0.biggestPerimeter(list).getName()+" with perimeter " + figureController0.biggestPerimeter(list).getPerimeter());
        System.out.println("\n");
        System.out.println("\n");

        list[3]=Circle;
        System.out.println("Figure 1 : "+ list[0].getName()+ " with aria " + list[0].getArea()+" and perimetrul "+ list[0].getPerimeter());
        System.out.println("Figure 2 : "+ list[1].getName()+ " with aria " + list[1].getArea()+" and perimetrul "+ list[1].getPerimeter());
        System.out.println("Figure 3 : "+ list[2].getName()+ " with aria " + list[2].getArea()+" and perimetrul "+ list[2].getPerimeter());
        System.out.println("Figure 4 : "+ list[3].getName()+ " with aria " + list[3].getArea()+" and perimetrul "+ list[3].getPerimeter());
        System.out.println("\n");

        System.out.println("Biggest area: "+ figureController0.biggestArea(list).getName() + " with area " + figureController0.biggestArea(list).getArea());
        System.out.println("Biggest perimeter: "+ figureController0.biggestPerimeter(list).getName()+" with perimeter " + figureController0.biggestPerimeter(list).getPerimeter());




    }
}
