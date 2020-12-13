package by.tce.jonline.counter;

/* Модуль 4. Простейшие классы и объекты. Задача 5
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое 
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями 
 * по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения 
 * состояния и метод, позволяющий получить его текущее состояние.
 */

public class Counter {
	private int counter;
	private int min;
	private int max;
	
	{
		counter = 0;
		min = 0;
		max = 10;
	}
	
	public Counter(int counter, int min, int max) { // полный набор параметров
		super();
		if(max<min) { // проверяем, что является верхней и нижней границей диапазона
			this.max = min;
			this.min = max;
		} else {
			this.min = min;
			this.max = max;
		}
		
		counterCheck(counter);
		
	}
	
	public Counter(int counter, int max) {	// счетчик и одна из границ диапазона
		super();
		if(max<min) { // проверяем, параметр является верхней или нижней границей диапазона
			this.max = min;
			min = max;
		} else {
			this.max = max;
		}
				
		counterCheck(counter);
		
	}
	
	public Counter(int counter) { // только счетчик
		super();
		counterCheck(counter);
	}
	
	private void counterCheck(int counter) {	// проверяем, входит ли счетчик в диапазон
		if(counter>max) {					// если превышен верхний предел
			this.counter = max;
			System.out.printf("Заданное значение счетчика вне заданного диапазона (от %d до %d)%n",min,max);
			System.out.println("Значение счетчика изменено на "+max);
		} else {
			if(counter<min) {				// если превышен нижний предел
				this.counter = min;
				System.out.printf("Заданное значение счетчика вне заданного диапазона (от %d до %d)%n",min,max);
				System.out.println("Значение счетчика изменено на "+min);
			} else {
				this.counter = counter;
			}
		}
		
	}

	public int getCounter() {
		return counter;
	}
	
	public void increment() {
		if(counter<max) {
			counter++;
		} else {
			System.out.println("Достигнут верхний предел диапазона");
		}
	}
	
	public void decrement() {
		if(counter>min) {
			counter--;
		} else {
			System.out.println("Достигнут нижний предел диапазона");
		}
	}

}
