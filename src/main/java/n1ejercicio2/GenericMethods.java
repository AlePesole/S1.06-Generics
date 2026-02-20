package n1ejercicio2;

public class GenericMethods {

    public static <T, S, U> void printElements(T t, S s, U u) {
        System.out.println(t + "\n" + s + "\n" + u);
    }
}
