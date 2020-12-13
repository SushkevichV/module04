package by.tce.jonline.text;

/* Модуль 4. Агрегация и композиция. Задача 1
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, 
 * вывести на консоль текст, заголовок текста.
 */

public class Sentence { // Класс Предложение
	private String value="";
	
	public void addValue(Word word) { // добавление слова
		value += word.getValue()+" ";
	}
	
	public String getValue() {
		value=value.trim()+".";
		return value;
	}

}
