package lab8;

public class Parallelepiped implements GeometricBody{
    private double l,L,h;

    public Parallelepiped(double l,double L,double h){
        this.l=l;
        this.L=L;
        this.h=h;
    }

    @Override
    public double getSurface() {
        return 2*l*L+2*L*h+2*l*h;
    }

    @Override
    public double getVolume() {
        return l*L*h;
    }
}
