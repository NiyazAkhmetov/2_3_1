package web;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements ICarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Honda", "Civic", "Red"));
        carList.add(new Car("Toyota", "Corolla", "Blue"));
        carList.add(new Car("Ford", "Focus", "Green"));
        carList.add(new Car("Lamborghini", "Aurus", "Yellow"));
        carList.add(new Car("Ferrari", "California", "Grey"));
    }

    @Override
    public List<Car> getCars(int count) {
        // Возвращает указанное количество машин
        if (count > carList.size()) {
            return carList; // Возвращаем весь список, если запрашиваемое больше доступного
        }
        return carList.subList(0, count);
    }
}

