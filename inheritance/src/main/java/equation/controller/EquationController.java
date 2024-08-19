package equation.controller;

import equation.dto.request.EquationRequest;
import equation.dto.respone.EquationResponse;
import equation.service.EquationSolvingService;
import equation.service.impl.FirstDegreeEquationSolvingService;

public class EquationController {
    public String solve(EquationRequest request) {
        EquationSolvingService service = new FirstDegreeEquationSolvingService();
        EquationResponse response = service.solve(request);
    }
}
