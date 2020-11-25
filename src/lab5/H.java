package lab5;

class H extends G{
    protected String h="H";
    private X x=new X("xH");
    protected H() {
    }

//    protected H(String h) {
//        this.h = h;
//    }

    public H(String a, String b, String c, String d, String e, String f, String g, String h) {
        super(a, b, c, d, e, f, g);
        this.h = h;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}