package pl.akademiakodu.kalkulatorpaliwa.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.kalkulatorpaliwa.Model.Calculator;

public interface CalculatorRepository extends CrudRepository<Calculator, Integer> {
}
