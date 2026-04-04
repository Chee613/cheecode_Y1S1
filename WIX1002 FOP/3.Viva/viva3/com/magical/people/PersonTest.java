package viva3.com.magical.people;

public class PersonTest {
    public static void main(String[] args) {
        // Create objects
        Person p1 = new Person();
        Person p2 = new Person("Luna", 20);
        Person p3 = new Person("Luna", 20);

        String name="Jitesh";
        

        // Test exceptions
        try {
            p1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        // Test compareTo
        System.out.println("Is p2 same as p3? " + p2.compareTo(p3)); // Should be true
        System.out.println("Is p1 same as p2? " + p1.compareTo(p2)); // Should be false

        // Verify count
        System.out.println("Total students in academy: " + Person.getPersonCount());
    }
}