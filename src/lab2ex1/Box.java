package lab2ex1;

public class Box {

    private float height;
    private float width;
    private float depth;

//metoda fara parametri
    public Box(){
        this.height=1;
        this.width=1;
        this.depth=1;
    }
//metoda printr-un parametru
    public Box(float parameter){
        this.height=parameter;
        this.width=parameter;
        this.depth=parameter;
    }
//metoda prin 3 parametri
    public Box(float height,float width,float depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }


    public float getDepth() {
        return depth;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    //V=L*l*h
    float getVolume(){
        return this.depth * this.height * this.width;
    }
//A=2*(L*l+L*h+l*h)
    float getArea(){
        return 2*((this.depth * this.width) + (this.depth * this.height) + (this.width * this.height));
    }



}


