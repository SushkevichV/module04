package by.tce.jonline.vehicle;

/* Модуль 4. Агрегация и композиция. Задача 2
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, 
 * заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Drive {

	public static void main(String[] args) {
        Vehicle car = new Vehicle();
        initVehicle(car);
        System.out.println("Марка автомобиля - "+car.getVehicleName());
        car.ignite();
        car.reFuel(80);
        car.ignite();
        car.startEngine();
        car.changeWheel(19);
        car.ignite();
        System.out.println("Пробег автомобиля составляет " + car.getMileage() + " км.");
        System.out.println("Остаток топлива " + car.getFuel() + " литров.");
        car.reFuel(70);
        car.ignite();
        car.startEngine();
        car.ignite();
        car.changeWheel(19);
        System.out.println("Пробег автомобиля составляет " + car.getMileage() + " км.");
        System.out.println("Остаток топлива " + car.getFuel() + " литров.");
    }

    public static void initVehicle(Vehicle Vehicle){
        Vehicle.setExpense(12);
        Vehicle.setVehicleName("Audi");
        Vehicle.setTank(90);
        Vehicle.setFuel(50);
    }

}
