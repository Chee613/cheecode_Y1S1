package viva3.com.maplestory;

public class MagicShieldTest {
    public static void main(String[] args) {
        try {
            // 1. Create multiple objects
            MagicShield s1 = new MagicShield();
            MagicShield s2 = new MagicShield(2.5, 10.0, "Fire");
            
            // 2. Test valid/invalid setters
            s1.setRadius(3.0);
            // s1.setRadius(-1.0); // Uncomment to see exception

            // 3. Print calculations
            System.out.println(s2.toString());
            System.out.println("Defense Power: " + s2.calculateDefensePower());
            System.out.println("Mana Cost: " + s2.calculateManaCost());

            // 4. Use static methods
            double staticPower = MagicShield.calculateDefensePower(5.0, 2.0, "Dark");
            System.out.println("Static Calculation (Dark Shield): " + staticPower);

            // 5. Output total count
            System.out.println("Total Shields Created: " + MagicShield.getShieldCount());

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

