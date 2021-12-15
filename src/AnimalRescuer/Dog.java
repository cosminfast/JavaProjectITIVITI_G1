package AnimalRescuer;

public  class Dog extends Animal{


    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    @Override
    public void speak(){
        System.out.println("Bark!");
    }

    @Override
    public void play(){
        System.out.println("Playing fetch.");
    }

    @Override
    public void sleep() {
        System.out.println("ZzzZZ!");
    }


}
