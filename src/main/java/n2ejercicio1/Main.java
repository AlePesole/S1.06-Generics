package n2ejercicio1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alessandro", "Pesole", 26);

        PartialGenericMethod.printElements(person, "I can only be a String", 10);
    }
}
