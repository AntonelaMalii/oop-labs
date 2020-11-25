package lab7;

import java.util.ArrayList;

public class FigureController {

    public Figure biggestArea(Figure[] objects){
        double temp=0;
        int k=0;
        for(int i=0;i<objects.length;i++){
            if(objects[i]!=null && objects[i].getArea()>temp){
               temp=objects[i].getArea();
                k=i;
            }
        }
        return objects[k];
    }

    public Figure biggestPerimeter(Figure[] objects){
        double temp=0;
        int k=0;
        for(int i=0;i<objects.length;i++){
            if(objects[i]!=null && objects[i].getPerimeter()>temp){
                temp=objects[i].getPerimeter();
                k=i;
            }
        }
        return objects[k];
    }


}
