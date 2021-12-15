package AnimalRescuer;

public class AnimalOwner {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feedAnimal(Animal animal, Food food) {
        if (animal.getHungerLevel() >= 0) {
            System.out.println(animal.getName() + " is eating " + food.getName());
            animal.setWeightKg(animal.getWeightKg() + food.getNutritionalValue());
            animal.setHungerLevel(animal.getHungerLevel() - 2);
            animal.setHappinessLevel(animal.getHappinessLevel()+1);
        }else
            System.out.println(animal.getName() + " refuses to eat. He is still full.");

    }

    public void playWithAnimal() {
        System.out.println("Playing with the animal");
    }

    public void adoptAnimal(Animal animal, AnimalOwner owner) {
        animal.setOwner(owner);
        animal.setHappinessLevel(5);
    }
}
