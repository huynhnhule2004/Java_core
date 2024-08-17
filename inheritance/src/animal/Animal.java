package animal;

public abstract class Animal implements Moveable{

    protected int numberOfLegs;

    protected Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public abstract void makeSound();

    public int legsAreInvalid() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        if(legsAreInvalid(numberOfLegs)) {
            System.out.println("Lỗi");
            return;
        }

        this.numberOfLegs = numberOfLegs;
    }

    protected boolean legsAreInvalid(int numberOfLegs) {
        return numberOfLegs < 0;
    }


}
