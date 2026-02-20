package n1ejercicio2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alessandro", "Pesole", 26);

        GenericMethods.printElements(person, "I can be any type", 10);
        System.out.println();
        GenericMethods.printElements(10, person, "I can be any type");
    }
}
