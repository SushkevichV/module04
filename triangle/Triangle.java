package by.tce.jonline.triangle;

/* Модуль 4. Простейшие классы и объекты. Задача 7
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
 * площади, периметра и точки перечения медиан.
 */

public class Triangle {
	private int[] pointA = new int[] {0,0};
	private int[] pointB = new int[] {0,3};
	private int[] pointC = new int[] {4,0};
	
	public Triangle(int[] pointA, int[] pointB, int[] pointC) {
		super();
		//(x1-x3)*(y2-y3)==(x2-x3)*(y1-y3) -- проверка, образуют ли точки треугольник
		if ((pointA[0]-pointC[0])*(pointB[1]-pointC[1])==(pointB[0]-pointC[0])*(pointA[1]-pointC[1])) {
			System.out.println("Заданные точки не образуют треугольник. Применены параметры по умолчанию.");
		}
		else {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		}
	}
	
	public Triangle() {
		super();
	}
	
	private static double sideLength(int[] a, int[] b) { // длина стороны
		double length;

		length = Math.sqrt((b[0]-a[0])*(b[0]-a[0]) + (b[1]-a[1])*(b[1]-a[1]));
		return length;
	}
	
	double perimeter() {
		double p;

		p = sideLength(pointA, pointB) + sideLength(pointA, pointC) + sideLength(pointB, pointC);
		return p;

	}
	
	double area() {
		double s;

		s = Math.abs((pointA[0] - pointC[0]) * (pointB[1] - pointC[1]) - (pointB[0] - pointC[0]) * (pointA[1] - pointC[1])) / 2;
		return s;
	}
	
	double[] pointMedian() {
		double[] median = new double[2];
		
		median[0] = (double)((pointA[0] + pointB[0] + pointC[0])) / 3;
		median[1] = (double)((pointA[1] + pointB[1] + pointC[1])) / 3;
		return median;
	}
	
}
