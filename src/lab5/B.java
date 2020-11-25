package lab5;

class B extends A {
    protected String b="B";
    protected B() {
    }

    protected B(String b) {
        this.b = b;
    }

        protected B(String a, String b) {
        super(a);
        this.b = b;
    }

//    public B(String a, X x, String b) {
//        super(a, x);
//        this.b = b;
//    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
