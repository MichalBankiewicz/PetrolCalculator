package pl.akademiakodu.kalkulatorpaliwa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.kalkulatorpaliwa.Model.Calculator;
import pl.akademiakodu.kalkulatorpaliwa.Model.CostCalculator;
import pl.akademiakodu.kalkulatorpaliwa.Repository.CalculatorRepository;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorRepository calculatorRepository;
    Calculator calculator = new Calculator();
    CostCalculator costCalculator = new CostCalculator();

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/main")
    public String indexGet(Model model) {
        model.addAttribute("calculator", calculator);
        return "calculate";
    }

/*    @RequestMapping(params = "costCalculator", method = RequestMethod.POST)
    public String create(@ModelAttribute("calculator") Calculator calculator, Model map) {
        map.addAttribute("result", costCalculator.costCalculator(calculator.getRouteInKilometers(),
                calculator.getAverageCombustion(), calculator.getFuelPricePerLiter()));

        return "calculate";
    }*/

    @RequestMapping(params = "costPerPerson", method = RequestMethod.POST)
    public String create2(@ModelAttribute("calculator") Calculator calculator, Model map) {
        map.addAttribute("result2", costCalculator.costPerPerson(calculator.getRouteInKilometers(),
                calculator.getAverageCombustion(), calculator.getFuelPricePerLiter(), calculator.getHowManyPeople()));
        calculatorRepository.save(calculator);
        return "calculate";
    }
    @GetMapping("/list")
    public String showElements(ModelMap map) {
        map.put("calculator", calculatorRepository.findAll());
        return "list";
    }
}
