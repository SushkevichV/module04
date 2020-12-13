package by.tce.jonline.triangle;

/* Модуль 4. Простейшие классы и объекты. Задача 7
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
 * площади, периметра и точки перечения медиан.
 */

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(new int[] {1,1}, new int[] {1,5}, new int[] {4,1});
		//triangle = new Triangle(); // объект с параметрами по умолчанию
		
		System.out.println("Площадь треугольника = "+triangle.area());
		System.out.println("Периметр треугольника = "+triangle.perimeter());
		System.out.printf("Медианы треугольника пересекаются в точке с координатами: (%.3f; %.3f)",triangle.pointMedian()[0], triangle.pointMedian()[1]);

	}

}
