package viva3.com.maplestory;

public class MagicShield {

    // Note: Using Double wrapper to support the "null" requirement in the problem statement
    private Double radius; 
    private Double thickness;
    private String elementType;

    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_THICKNESS = 5.0;
    private static int shieldCount = 0;

    // No-argument Constructor
    public MagicShield() {
        this.radius = DEFAULT_RADIUS;
        this.thickness = DEFAULT_THICKNESS;
        this.elementType = "Neutral";
        shieldCount++;
    }

    // Parameterized Constructor
    public MagicShield(Double radius, Double thickness, String elementType) {
        this.radius = radius;
        this.thickness = thickness;
        setElementType(elementType);
        shieldCount++;
    }

    // Encapsulation Methods
    public Double getRadius() { 
        return radius; 
    }
    
    public void setRadius(double radius) {
        if (radius < 0) 
            throw new IllegalArgumentException("Invalid radius");
        this.radius = radius;
    }

    public Double getThickness() { 
        return thickness; 
    }
    
    public void setThickness(double thickness) {
        if (thickness < 0) 
            throw new IllegalArgumentException("Invalid thickness");
        this.thickness = thickness;
    }

    public String getElementType() { 
        return elementType; 
    }
    
    public void setElementType(String type) {
        if (type == null || type.isEmpty()) {
            this.elementType = "Neutral";
        } else {
            this.elementType = type;
        }
    }

    // Logic Methods
    public double calculateDefensePower() {
        return calculateDefensePower(this.radius, this.thickness, this.elementType);
    }

    public double calculateManaCost() {
        return calculateManaCost(this.radius, this.thickness);
    }

    // Static Methods
    public static int getShieldCount() { 
        return shieldCount; 
    }

    public static boolean isValidSize(double size) {
        return size >= 0;
    }

    public static double calculateDefensePower(double radius, double thickness, String elementType) {
        double coefficient;
        switch (elementType != null ? elementType : "Neutral") {
            case "Fire": coefficient = 1.1; break;
            case "Ice": coefficient = 1.2; break;
            case "Light": coefficient = 1.3; break;
            case "Dark": coefficient = 1.4; break;
            default: coefficient = 1.0; break;
        }
        return (radius * thickness) * coefficient;
    }

    public static double calculateManaCost(double radius, double thickness) {
        return (radius * 10) + (thickness * 2);
    }

    @Override
    public String toString() {
        return String.format("[MagicShield Info] %nElement Type: %s %nRadius: %.1fm %nThickness: %.1fcm", 
                              elementType, radius, thickness);
    }
}

