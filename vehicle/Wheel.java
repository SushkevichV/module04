package by.tce.jonline.vehicle;

/* Модуль 4. Агрегация и композиция. Задача 2
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, 
 * заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Wheel {

    private final double RADIUS = 15;

    private double radius;

    Wheel(){
        this.radius = RADIUS;
    }

    Wheel(double radius){
        if(radius <= 17 || radius >= 20){
            System.out.println("Размер колеса должен быть от 17 до 20 дюймов");
        } else
            this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRaduis(double radius){
        if(radius <= 17 || radius >= 20){
            throw new IllegalArgumentException("Размер колеса должен быть от 17 до 20 дюймов");
        } else
            this.radius = radius;
    }
  
}
