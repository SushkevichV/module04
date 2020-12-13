package by.tce.jonline.test2;

/* Модуль 4. Простейшие классы и объекты. Задача 2
 * Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей 
 * экземпляра класса.
 */

public class Test2 {
	private int var1;
	private int var2;
	
	{
		var1 = 1;
		var2 = 2;
	}
	
	public Test2(int var1, int var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	public void show() {
		System.out.printf("Переменная 1 = %d, переменная 2 = %d", var1, var2);
	}

}
