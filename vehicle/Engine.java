package by.tce.jonline.vehicle;

/* Модуль 4. Агрегация и композиция. Задача 2
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, 
 * заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Engine {

    private int mileage = 0; // пробег
    private boolean hasStarted = false; // двигатель заведен
    private int expense=5; // расход топлива

    public Engine(){
        this.expense = 5;
        this.mileage = 0;
        hasStarted = false;
    }

    public void startEngine(){ // запуск двигателя
        this.hasStarted = true;
        System.out.println("Двигатель заведён");
    }
    public void stopEngine(){ // остановка двигателя
        this.hasStarted = false;
    }

    public boolean hasStarted(){
        return this.hasStarted;
    }

    public void setExpense(int expense){
        this.expense = expense;
    }

    public int getExpense(){
        return this.expense;
    }

    public int getMileage(){
       return this.mileage;
    }
    public void increase(){ // пробег
        mileage+=100;
    }
    
}
