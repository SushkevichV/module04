package by.tce.jonline.text;

/* Модуль 4. Агрегация и композиция. Задача 1
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, 
 * вывести на консоль текст, заголовок текста.
 */

public class Text { // Класс Текст
	private String header="";
	private String text="";
	
	public Text(Word word) { // заголовок
		header = word.getValue();
	}
	
	public Text(Sentence sentence){ // заголовок
		header = sentence.getValue();
	}
	
	public String getHeader() {
		return header;
	}
	
	public void addValue (Word word) { // добавление слова в текст
		text+=word.getValue()+" ";
	}
	
	public void addValue (Sentence sentence) { // добавление предложения в текст
		text+=sentence.getValue()+" ";
	}
	
	public String getValue() {
		return text;
	}

}
