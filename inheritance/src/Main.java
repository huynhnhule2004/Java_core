import animal.Animal;
import animal.Chicken;
import animal.Dog;
import animal.Flyable;
import com.sun.net.httpserver.Request;
import equation.dto.request.EquationRequest;
import equation.dto.respone.EquationResponse;
import equation.service.EquationSolvingService;
import equation.service.impl.FirstDegreeEquationSolvingService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Animal a1 = new Dog();
//        Animal a2 = new Chicken();

//        a1.makeSound();
//        a2.makeSound();

//        a1.setNumberOfLegs(6);
//        a1.move("a", "b");
//        a2.move("c", "d");
//
//        Chicken a3 = new Chicken();
//        a3.fly();
//        double pi = Flyable.PI;

        EquationSolvingService service = new FirstDegreeEquationSolvingService();

        EquationResponse response = service.solve(new EquationRequest(0, 0));

        System.out.println(response);

    }
}