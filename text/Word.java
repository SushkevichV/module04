package by.tce.jonline.text;

/* Модуль 4. Агрегация и композиция. Задача 1
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, 
 * вывести на консоль текст, заголовок текста.
 */

public class Word { // Класс Слово
	private String value;
	
	public Word (String value) { // конструктор
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
