package sheltertest;

public class VirtualPet {
    String name;
    String description;
    int hunger;
    int thirst;
    int boredom;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        // Set default values for attributes
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
    }

    // Getters and setters for attributes

    public void tick() {
        // Update pet's attributes based on time passing
        hunger += 5;
        thirst += 5;
        boredom += 5;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void feed() { hunger += 5;
    }

    public void water() { thirst += 5;
    }

    public void play() { boredom += 5;
    }
}
