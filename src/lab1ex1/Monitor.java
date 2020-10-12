package lab1ex1;


public class Monitor {
    String color;
    int dimensions;
    int resolution;


    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getDimensions() {
        return dimensions;

    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setResolution(int resolution){
        this.resolution=resolution;
    }
    public int getResolution(){
        return resolution;
    }

    public static void compare(Monitor monitor1 , Monitor monitor2){

        if (monitor1.resolution>monitor2.resolution){
            System.out.println("The first monitor has bigger resolution than the second monitor" );
        } else
        {System.out.println("The second monitor has bigger resolution than the first monitor");}

        if (monitor1.dimensions>monitor2.dimensions){
            System.out.println("The first monitor has bigger dimensions than the second monitor" );
        } else
        {System.out.println("The second monitor has bigger resolution than the first monitor");}
        if (monitor1.color!=monitor2.color){
            System.out.println("Monitors have different colors");
        }else
        {
            System.out.println("Monitors have the same color");
        }

    }
}

