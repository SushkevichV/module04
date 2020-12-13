package by.tce.jonline.vehicle;

/* Модуль 4. Агрегация и композиция. Задача 2
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, 
 * заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Vehicle {

    private String VehicleName; // марка автомобиля
    private int tank;			// есмкость топливного бака
    private int fuel;			// остаток топлива

    private Engine engine = new Engine();

    private Wheel frontRight = new Wheel();
    private Wheel frontLeft = new Wheel();
    private Wheel rearRight = new Wheel();
    private Wheel rearLeft = new Wheel();
    
    Vehicle(){
        this.VehicleName = "Vehicle";
        this.tank = 80;
        this.fuel = tank;
    }
    
    Vehicle(String name, int fuel, int tank){
        if(name == null || name==""){
        	System.out.println("Не указана марка автомобиля");
        } else {
            this.VehicleName = name;
        }
        if(tank < 0) {
        	System.out.println("Ёмкость бака не может быть отрицательной");
        } else {
            this.tank = tank;
        }
        if(fuel < 0) {
        	System.out.println("Остаток топлива не может быть отрицательным");
        } else {
        this.fuel = fuel;
        }
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String VehicleName) {
        this.VehicleName = VehicleName;
    }

    public void setTank(int tank){
        this.tank = tank;
        this.fuel = this.tank;
    }

    public int getFuel(){
        return this.fuel;
    }

    public void ignite() { // зажигание
        if(this.fuel==0)
            System.out.println("Ехать не возможно, бак пуст");
        else if (!engine.hasStarted()){
            System.out.println("Двигатель не заведён");
        }
        else {
            System.out.println("Едем");
            isRide();
        }
    }

    private void isRide(){ // движение
        for(int i = fuel; i > 0; i-=engine.getExpense()){
            if(fuel - engine.getExpense() < 0){
                engine.stopEngine();
                break;
            } else {
            fuel-= engine.getExpense();
            engine.increase();
            }
        }
        if (fuel-engine.getExpense()<0) {
        	engine.stopEngine();
        	System.out.println("Топливо закончилось. Необходимо заправится");
        }
    }

    public void reFuel(int fuel) { // заправка
        int availability = this.tank - this.fuel;
        if(this.tank==0)
            System.out.println("Не установлена ёмкость бака");
        else if(availability < fuel)
            System.out.println("Заправить можно не более " + availability + " литров.");
        else {
        	this.fuel+=fuel;
            System.out.print("Машина успешно заправлена на " + fuel + " литров. ");
            System.out.println("Остаток в баке " + this.fuel + " литров");
        }

    }

    public void changeWheel(double radius) { // замена колес
        if(this.engine.hasStarted()){
            System.out.println("Для замены колес необходимо остановить автомобиль.");
        } else {
            frontRight = new Wheel(radius);
            frontLeft = new Wheel(radius);
            rearRight = new Wheel(radius);
            rearLeft = new Wheel(radius);
            System.out.println("Колёса успешно заменены");
        }
    }

    public void startEngine(){
        if(fuel!=0)
            engine.startEngine();
        else
            System.out.println("В баке не осталось топлива");
    }

    public int getMileage(){
        return engine.getMileage();
    }
    public void setExpense(int expense){
        engine.setExpense(expense);
    }

	public void setFuel(int fuel) {
        if(fuel < 0) {
        	System.out.println("Остаток топлива не может быть отрицательным");
        } else {
        this.fuel = fuel;
        }
		
	}
    
}
