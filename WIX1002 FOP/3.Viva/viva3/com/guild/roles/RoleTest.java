package viva3.com.guild.roles;

public class RoleTest {
    public static void main(String[] args) {
        // Create objects using both constructors
        Role r1 = new Role();
        Role r2 = new Role("Aria", 120, "Elf", 500.0);

        // Modify attributes using setters
        r1.setName("Grog");
        r1.setRace("Orc");
        r1.setAge(35);
        r1.setMana(4.0);

        // Call performAction and print details
        displayRole(r1);
        displayRole(r2);
    }

    private static void displayRole(Role r) {
        r.performAction();
        System.out.println("Details: [Name: " + r.getName() + ", Age: " + r.getAge() + 
                           ", Race: " + r.getRace() + ", Mana: " + r.getMana() + "]");
        System.out.println("-------------------------");
    }
}