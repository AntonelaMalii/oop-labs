package lab1ex1;

public class Lab1 {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();

        monitor1.setDimensions(150);
        monitor1.setColor("grey");
        monitor1.setResolution(512);

        monitor2.setDimensions(140);
        monitor2.setResolution(1024);
        monitor2.setColor("red");

        System.out.println("Show information about monitors:\n");

        System.out.println("The first monitor:\n");
        System.out.println("Dimension:"+monitor1.getDimensions());
        System.out.println("Color:"+monitor1.getColor());
        System.out.println("Resolution:"+ monitor1.getResolution());
        System.out.println("\n");
        System.out.println("The second monitor:\n");
        System.out.println("Dimension:"+monitor2.getDimensions());
        System.out.println("Color:"+monitor2.getColor());
        System.out.println("Resolution:"+monitor2.getResolution());
        System.out.println("\n");
        System.out.println("Initial comparation:");
        Monitor.compare(monitor1,monitor2);
        monitor1.setDimensions(100);
        monitor1.setColor("red");
        monitor1.setResolution(720);
        System.out.println("Result after updating the values of monitor1:");
        Monitor.compare(monitor1,monitor2);


    }
}

