package A;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    List<Car> cars;

    @Before
    public void init() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW","X6", 2015, 400000));
        cars.add(new Car("Audi","r7", 2010, 220000));
        cars.add(new Car("Audi","r7", 2015, 210000));
        cars.add(new Car("BMW","5", 2015, 420000));
        cars.add(new Car("Bentley","bentayga", 2014, 300000));
        cars.add(new Car("Bugatti","veyron", 2008, 180000));
        cars.add(new Car("Audi","a3", 2010, 215000));

    }


    @Test
    public void getCarByBrand() {
        String brand = "BMW";
        List<Car> carsBrands = new ArrayList<>();
        for (Car car : cars) {
            if (brand.toLowerCase().equals(car.getBrand().toLowerCase())) {
                carsBrands.add(car);
            }
        }
        System.out.println("Авто марки " + brand + ": \n");
        System.out.println(carsBrands);
        System.out.println();
    }

    @Test
    public void getCarByModelAndOldAge() {
        String model = "r7";
        int n = 4;
        List<Car> result = new ArrayList<>();
        this.cars.forEach(car -> {
            if (car.getModel().equals(model) && (2018 - car.yearOfManufacture) < n) {
                result.add(car);
            }
        });
        System.out.println("Авто модели " + model + ", которые не старше " + n + " лет:  \n");
        System.out.println(result);
        System.out.println();
    }
}
