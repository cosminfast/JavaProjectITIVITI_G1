package AnimalRescuer;

public class AppMain {

    public static void main(String[] args) {
        AppMain appMain = new AppMain();
        Girl hannah = new Girl();
        DogFood food = new DogFood();
        appMain.initFood(food);
        appMain.initGirl(hannah);

        Labrador labrador = new Labrador();
        appMain.initDog(labrador);

        hannah.adoptAnimal(labrador, hannah);
        System.out.println(labrador.getOwner().getName());
        System.out.println("Fetita duce acasa labaradorul si ii da de mancare");
        hannah.feedAnimal(labrador, food);
        System.out.println(labrador.getName()+" happiness level is: " + labrador.getHappinessLevel());
        System.out.println(labrador.getName()+" hunger level is: " + labrador.getHungerLevel());


    }

    private void initGirl(Girl girl) {
        girl.setName("Hannah");
        girl.setAge(7);
    }

    private void initDog(Labrador dog) {
        dog.setName("Confucius");
        dog.setRace("Labrador");
        dog.setAgeYears(3);
        dog.setColor("golden");
        dog.setWeightKg(13.3f);
        dog.setHasVaccines(true);
        dog.setHappinessLevel(0);
        dog.setHungerLevel(3);
    }

    private void initFood(Food food) {
        food.setName("Purina");
        food.setNutritionalValue(0.3f);
    }

}
