package lab5;

class X {
    private String x;

    @Override
    public String toString() {
        return "X{" +
                "x='" + x + '\'' +
                '}';
    }

    public X(String x) {
        this.x = x;
    }
}