package by.tce.jonline.counter;

/* Модуль 4. Простейшие классы и объекты. Задача 5
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое 
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями 
 * по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения 
 * состояния и метод, позволяющий получить его текущее состояние.
 */

public class Main {

	public static void main(String[] args) {

		Counter count = new Counter(9); // инициализация с одним параметром
		count.increment();
		System.out.printf("Текущее значение счетчика - %d%n%n",count.getCounter());
		
		count = new Counter(8,-4); // инициализация с двумя параметрами
		count.decrement();
		System.out.printf("Текущее значение счетчика - %d%n%n",count.getCounter());
		
		count = new Counter(1,2,12); // инициализация с тремя параметрами
		count.decrement();
		System.out.printf("Текущее значение счетчика - %d%n%n",count.getCounter());

	}

}
