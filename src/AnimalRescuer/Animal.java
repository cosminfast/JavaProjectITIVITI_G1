package AnimalRescuer;

public abstract class Animal {
    private String race;
    private int ageYears;
    private String color;
    private String name;
    private float weightKg;
    private boolean hasVaccines;
    private AnimalOwner owner;
    private int happinessLevel;
    private int hungerLevel;

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }


    public AnimalOwner getOwner() {
        return owner;
    }

    public void setOwner(AnimalOwner owner) {
        this.owner = owner;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(float weightKg) {
        this.weightKg = weightKg;
    }

    public boolean isHasVaccines() {
        return hasVaccines;
    }

    public void setHasVaccines(boolean hasVaccines) {
        this.hasVaccines = hasVaccines;
    }


    public abstract void eat();

    public abstract void speak();

    public abstract void play();

    public abstract void sleep();

}
