package equation.service;

import equation.dto.request.EquationRequest;
import equation.dto.respone.EquationResponse;

public interface EquationSolvingService {
    EquationResponse solve(EquationRequest request);
}
