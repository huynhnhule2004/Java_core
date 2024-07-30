//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");
        System.out.println("Radius of Circle:" + circle.getRadius());
        System.out.println("Color of Circle:" + circle.getColor());
        System.out.println("Area of Circle:" + String.format("%.2f", circle.getArea()));
        System.out.println("Perimeter of Circle:" + String.format("%.2f", circle.getPerimeter()));

    }
}