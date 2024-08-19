package equation.dto.respone;

public class EquationResponse {

    private double x;
    private boolean hasInfiniteSolutions;
    private boolean hasNoSolution;


    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }


    public Boolean getHasInfiniteSolutions() {
        return hasInfiniteSolutions;
    }

    public void setHasInfiniteSolutions(Boolean hasInfiniteSolutions) {
        this.hasInfiniteSolutions = hasInfiniteSolutions;
    }

    public Boolean getHasNoSolution() {
        return hasNoSolution;
    }

    public void setHasNoSolution(Boolean hasNoSolution) {
        this.hasNoSolution = hasNoSolution;
    }

    @Override
    public String toString() {
        return "EquationResponse{" +
                "x=" + x +
                ", hasInfiniteSolutions=" + hasInfiniteSolutions +
                ", hasNoSolution=" + hasNoSolution +
                '}';
    }
}
