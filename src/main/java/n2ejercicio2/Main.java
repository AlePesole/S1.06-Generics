package n2ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Cristiano", "Ronaldo", 41);
        Person person2 = new Person("Francesco", "Totti", 49);

        VarargsMethod.printAll(person1, "Hola", person2, 10, -5);
    }
}
