package pl.akademiakodu.kalkulatorpaliwa.Model;

public class CostCalculator {

    /*    public Double costCalculator(double routeInKilometers, double averageCombustion, double fuelPricePerLiter){
                double result=((routeInKilometers/100)*averageCombustion)*fuelPricePerLiter;
                return result;
            }*/
    public String costPerPerson(double routeInKilometers, double averageCombustion, double fuelPricePerLiter, int howManyPeople){
        double result2=(((routeInKilometers/100)*averageCombustion)*fuelPricePerLiter)/howManyPeople;

        return String.format("%.2f", (double) result2);
    }
}
