package lab2ex1;

public class Main {
    public static void main(String[] args) {

        Box box1= new Box();

        System.out.println("The first method without parameters (default instantiated value to 1):");
        System.out.println("First box width: "+box1.getWidth());
        System.out.println("First box height: "+box1.getHeight());
        System.out.println("First box depth: "+box1.getDepth());
        System.out.println("The area of the first box is: " + box1.getArea());
        System.out.println("The volume of the first box is: " + box1.getVolume());
        System.out.println("\n");

        Box box2=new Box(2);

        System.out.println("The method with 1 parameter (for all instance variables with the same value):");
        System.out.println("Second box box width: "+box2.getWidth());
        System.out.println("Second box height: "+box2.getHeight());
        System.out.println("Second box depth: "+box2.getDepth());
        System.out.println("The area of the second box is: " + box2.getArea());
        System.out.println("The volume of the second box is:" + box2.getVolume());
        System.out.println("\n");

        Box box3=new Box(2,3,4);

        System.out.println("The method with 3 parameters for each instance variable:");
        System.out.println("Third box width: "+box3.getWidth());
        System.out.println("Third box height: "+box3.getHeight());
        System.out.println("Third box depth: "+box3.getDepth());
        System.out.println("The area of third box is: " + box3.getArea());
        System.out.println("The volume of the third box is: " + box3.getVolume());
        System.out.println("\n");
    }
}
