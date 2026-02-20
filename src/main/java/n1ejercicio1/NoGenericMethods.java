package n1ejercicio1;

public class NoGenericMethods {
    private String line1;
    private String line2;
    private String line3;

    public NoGenericMethods(String line1, String line2, String line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    @Override
    public String toString() {
        return line1 + ", " + line2 + ", " + line3;
    }
}
