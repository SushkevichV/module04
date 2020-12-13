package by.tce.jonline.modul4;

/* Модуль 4. Простейшие классы и объекты. Задача 1
 * Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения 
 * этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод,
 * который находит наибольшее значение из этих двух переменных.
 */

public class Test1 {

	private int add1=0;
	private int add2=0;
	
	public void setVar(int a1, int a2) {
		add1 = a1;
		add2 = a2;
	}

	public int sum() {
		return add1+add2;
	}

	public int max() {
		if(add1>add2) {
			return add1;
		} else {
			return add2;
		}
		
	}
	
	public void show() {
		System.out.printf("%d + %d = %d%n", add1, add2, sum());
		System.out.printf("%d - наибольшее из слагаемых%n%n", max());
	}
	
}
