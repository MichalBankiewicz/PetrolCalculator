package pl.akademiakodu.kalkulatorpaliwa.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Calculator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Double routeInKilometers;
    private double averageCombustion;
    private double fuelPricePerLiter;
    private int howManyPeople;



    public Double getRouteInKilometers() {
        return routeInKilometers;
    }

    public void setRouteInKilometers(Double routeInKilometers) {
        this.routeInKilometers = routeInKilometers;
    }

    public double getAverageCombustion() {
        return averageCombustion;
    }

    public void setAverageCombustion(double averageCombustion) {
        this.averageCombustion = averageCombustion;
    }

    public double getFuelPricePerLiter() {
        return fuelPricePerLiter;
    }

    public void setFuelPricePerLiter(double fuelPricePerLiter) {
        this.fuelPricePerLiter = fuelPricePerLiter;
    }

    public int getHowManyPeople() {
        return howManyPeople;
    }

    public void setHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
    }
}
