package lab5;


class D extends C {
    protected String d="D";

    protected X x=new X("XD");

    protected D() {
    }

//    protected D(String d) {
//        this.d = d;
//    }


    public D(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}