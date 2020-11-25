package lab5;

class A {
    protected String a="A";
    protected X x=new X("xxx");

    protected A() {
    }

    public A(String a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
    public A(String a, X x){
        this.a=a;
        this.x=x;
    }
}
