package n1ejercicio1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("One", "Two", "Three");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Two", "Three", "One");

        System.out.println(noGenericMethods1.getLine1()
                + " " + noGenericMethods1.getLine2()
                + " " + noGenericMethods1.getLine3());

        System.out.println(noGenericMethods2.getLine1()
                + " " + noGenericMethods2.getLine2()
                + " " + noGenericMethods2.getLine3());
    }
}
