package animal;

import java.util.Random;

public class Chicken extends Animal implements Flyable{

    public Chicken() {
        super(2);
    }

    @Override
    public void makeSound() {
        System.out.println("cuc tac");
    }

    @Override
    protected boolean legsAreInvalid(int numberOfLegs) {
        return super.legsAreInvalid(numberOfLegs) || numberOfLegs > 2;
    }

    @Override
    public void fly() {
        Random rand = new Random();
       int distance =  rand.nextInt(10);
       System.out.printf("This chicken has flied %dm\n", distance);
    }

    @Override
    public int move(String from, String to) {
        Random rand = new Random();
        int numberOfFootSteps = rand.nextInt(10000);
        System.out.printf("This chicken has moved from %s to %s by %d steps\n", from, to, numberOfFootSteps);
        return numberOfFootSteps;
    }
}
