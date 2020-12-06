package lab8;


public class GeometricBodyController {


    public GeometricBody biggestSurface(GeometricBody[] objects){
        double temp=0;
        int k=0;
        for(int i=0;i<objects.length;i++){
            if(objects[i]!=null && objects[i].getSurface()>temp){
                temp=objects[i].getSurface();
                k=i;
            }
        }
        return objects[k];
    }

    public GeometricBody biggestVolume(GeometricBody[] objects){
        double temp=0;
        int k=0;
        for(int i=0;i<objects.length;i++){
            if(objects[i]!=null && objects[i].getVolume()>temp){
                temp=objects[i].getVolume();
                k=i;
            }
        }
        return objects[k];
    }

}
