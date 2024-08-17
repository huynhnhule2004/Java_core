package animal;

public interface Flyable {

    //public static final
    double PI = 3.14;
    //public abstract
    void fly();

    default String abc(){
        xyz();
        return "abc";
    }

    private String xyz(){
        return "abc";
    }
}
