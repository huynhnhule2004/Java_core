package equation.dto.request;

public class EquationRequest {

    private double a;

    private double b;

    public EquationRequest(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }



    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


}
