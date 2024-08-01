public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    Point(){}

    public void display(){
        System.out.println(this.x + ", " + this.y);
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public float distanceFromOrigin(){
        return (float) Math.sqrt( (float) Math.pow(-this.x, 2) + (float) Math.pow(-this.y, 2));
    }

    public float floatDistance(Point p){
        return (float) Math.sqrt( (float) Math.pow(p.x - this.x, 2) + (float) Math.pow(p.y -this.y, 2));

    }

    public Point symmetricAcrossOx(){
        return new Point(this.x, -this.y);
    }

    public Point symmetricAcrossOy(){
        return new Point(-this.x, this.y);
    }
}
