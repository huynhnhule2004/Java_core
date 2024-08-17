package animal;

import java.util.Random;

public class Dog extends Animal{

    public Dog() {
        super(4);
    }

    @Override
    public void makeSound(){
        System.out.println("gau");
    }

    @Override
    protected boolean legsAreInvalid(int numberOfLegs){
        return super.legsAreInvalid(numberOfLegs) || numberOfLegs > 4;
    }

    @Override
    public int move(String from, String to) {
        Random rand = new Random();
        int numberOfFootSteps = rand.nextInt(1000);
        System.out.printf("This dog has moved from %s to %s by %d steps\n", from, to, numberOfFootSteps);
        return numberOfFootSteps;
    }
}
