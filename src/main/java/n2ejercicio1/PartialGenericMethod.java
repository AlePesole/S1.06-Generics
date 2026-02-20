package n2ejercicio1;

public class PartialGenericMethod {
    public static <T, U> void printElements(T t, String s, U u) {
        System.out.println(t + "\n" + s + "\n" + u);
    }
}
