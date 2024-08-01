//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.move(1, 10);
        p1.display();
        System.out.println("Khoảng cách p1 đén tọa độ 0 là:" + p1.distanceFromOrigin());

        Point p2 = new Point(1, 2);
        System.out.println("Khoảng cách p2 đến p1 là:" + p2.floatDistance(p1));

        Point symOx = p1.symmetricAcrossOx();
        Point symOy = p1.symmetricAcrossOy();

        System.out.println("Symmetric across Ox:");
        symOx.display();

        System.out.println("Symmetric across Oy:");
        symOy.display();


    }
}