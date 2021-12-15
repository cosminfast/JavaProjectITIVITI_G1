package AnimalRescuer;

public abstract class Food {

    private String name;
    private float nutritionalValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(float nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
}
