package equation.service.impl;

import equation.dto.request.EquationRequest;
import equation.dto.respone.EquationResponse;
import equation.service.EquationSolvingService;

public class FirstDegreeEquationSolvingService implements EquationSolvingService {

    @Override
    public EquationResponse solve(EquationRequest request) {
        double a = request.getA();
        double b = request.getB();
        EquationResponse response = new EquationResponse();

        if (a == 0) {
            if(b == 0) {
                response.setHasInfiniteSolutions(true);
            } else
                response.setHasNoSolution(true);
        } else {
            double x = -b / a;
            response.setX(x);
        }
        return response;
    }
}
