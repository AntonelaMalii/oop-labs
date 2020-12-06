package lab8;



public class Main {

    public static void main(String[] args) {

        Cub cube = new Cub(5);
        Parallelepiped parallelepiped=new Parallelepiped(3,5,12);
        Sphere sphere = new Sphere(10);

        System.out.println("Surface of the cube: "+ cube.getSurface());
        System.out.println("Volume of the cube: "+ cube.getVolume() + "\n");
        System.out.println("Surface of the parallelipiped: "+ parallelepiped.getSurface());
        System.out.println("Volume of the parallelipiped: "+ parallelepiped.getVolume() + "\n");
        System.out.println("Surface of the sphere: "+ sphere.getSurface());
        System.out.println("Volume of the sphere : "+ sphere.getVolume() + "\n");


        GeometricBody[] figures = new GeometricBody[3];
        figures[0]=cube;
        figures[1]=parallelepiped;
        figures[2]=sphere;

        GeometricBodyController Controller = new GeometricBodyController();

        System.out.println("Biggest surface :" + Controller.biggestSurface(figures).getClass().getSimpleName() + "= "+ Controller.biggestSurface(figures).getSurface());
        System.out.println("Biggest volume :" + Controller.biggestVolume(figures).getClass().getSimpleName() + "= "+ Controller.biggestVolume(figures).getVolume());
    }


}
