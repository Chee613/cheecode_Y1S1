package Lab.Lab8;
class BurgerStall {
    // Instance variables: Unique to each individual stall
    private String stallId;
    private int burgersSold;

    // Static variable: Shared across all instances of the class
    private static int totalBurgersSoldAllStalls = 0;

    // Constructor to initialize the stall ID and set initial sales to 0
    public BurgerStall(String stallId) {
        this.stallId = stallId;
        this.burgersSold = 0;
    }

    // Method to increment burger sales for a specific stall
    public void sold(int amount) {
        if (amount > 0) {
            this.burgersSold += amount;
            // Also update the global counter
            totalBurgersSoldAllStalls += amount;
        }
    }

    // Getters
    public String getStallId() {
        return stallId;
    }

    public int getBurgersSold() {
        return burgersSold;
    }

    // Static method to get the grand total across all stalls
    public static int getTotalBurgersSoldAllStalls() {
        return totalBurgersSoldAllStalls;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create three different stalls
        BurgerStall stall1 = new BurgerStall("STALL-001");
        BurgerStall stall2 = new BurgerStall("STALL-002");
        BurgerStall stall3 = new BurgerStall("STALL-003");

        // Simulate sales
        stall1.sold(50);
        stall2.sold(30);
        stall3.sold(45);
        stall1.sold(10); // Adding more to stall 1

        // Display results
        System.out.println("--- Daily Burger Sales Report ---");
        displayStallInfo(stall1);
        displayStallInfo(stall2);
        displayStallInfo(stall3);
        
        System.out.println("---------------------------------");
        System.out.println("Total Burgers Sold (All Stalls): " + BurgerStall.getTotalBurgersSoldAllStalls());
    }

    // Helper method for clean printing
    public static void displayStallInfo(BurgerStall stall) {
        System.out.println("Stall ID: " + stall.getStallId() + " | Sold: " + stall.getBurgersSold());
    }
}