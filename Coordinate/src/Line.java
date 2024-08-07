public class Line {
    private Point d1;
    private Point d2;

    public Line(Point d1, Point d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public Line(int ax, int ay, int bx, int by) {
        this.d1 = new Point(ax, ay);
        this.d2 = new Point(bx, by);
    }

    public void display() {
        System.out.println(this.d1);
        System.out.println(this.d2);
    }

    public void translate(int dx, int dy) {
        d1.move(dx, dy);
        d2.move(dx, dy);
    }

    public float lengthLine() {
        return d1.floatDistance(d2);
    }


}
