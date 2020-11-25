package lab5;

class E extends D {
    protected String e="E";
    protected E() {
    }

//    protected E(String e) {
//        this.e = e;
//    }


    public E(String a, String b, String c, String d, String e) {
        super(a, b, c, d);
        this.e = e;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}