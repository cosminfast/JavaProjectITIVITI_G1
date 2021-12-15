package AnimalRescuer;

public class Cat extends Animal{

    private int lifesLeft = 9;

    public int getLifesLeft() {
        return lifesLeft;
    }

    public void setLifesLeft(int lifesLeft) {
        this.lifesLeft = lifesLeft;
    }


    public void purr(){
        System.out.println("purrrrrrr");
    }

    @Override
    public void eat() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleep() {

    }
}
