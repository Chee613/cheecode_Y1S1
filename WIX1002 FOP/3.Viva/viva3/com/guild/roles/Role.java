package viva3.com.guild.roles;

public class Role {
    // Encapsulated Instance Variables
    private String name;
    private Integer age; // Using Integer to allow null as requested
    private String race;
    private Double mana; // Using Double to allow null

    // No-argument Constructor
    public Role() {
        this.name = "Unknown";
        this.age = 0;
        this.race = "Human";
        this.mana = 0.0;
    }

    // Parameterized Constructor
    public Role(String name, Integer age, String race, Double mana) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.mana = mana;
    }

    // Getters and Setters
    public String getName() { 
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public Integer getAge() { 
        return age; 
    }
    
    public void setAge(Integer age) { 
        this.age = age; 
    }

    public String getRace() { 
        return race; 
    }
    
    public void setRace(String race) { 
        this.race = race; 
    }

    public Double getMana() { 
        return mana; 
    }
    
    public void setMana(Double mana) { 
        this.mana = mana; 
    }

    // Instance Method
    public void performAction() {
        System.out.println(name + " is performing a magical action.");
    }
}