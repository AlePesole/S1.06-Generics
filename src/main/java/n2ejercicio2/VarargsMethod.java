package n2ejercicio2;

public class VarargsMethod {

    public static <T> void printAll(T... elements) {
        for (T t : elements) {
            System.out.println(t);
        }
    }
}
