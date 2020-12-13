package by.tce.jonline.text;

/* Модуль 4. Агрегация и композиция. Задача 1
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, 
 * вывести на консоль текст, заголовок текста.
 */

public class Main {

	public static void main(String[] args) {
		Word word = new Word("Заголовок");
		Sentence sentence = new Sentence();
		sentence.addValue(word);
		word = new Word("текста");
		sentence.addValue(word);
		
		Text text = new Text(sentence); // инициализация с заголовком
		
		Word word1 = new Word("Слова");
		Word word2 = new Word("образуют");
		Word word3 = new Word("предложения");
		
		sentence = new Sentence();
		sentence.addValue(word1);
		sentence.addValue(word2);
		sentence.addValue(word3);
		
		text.addValue(sentence); // добавление предложения в текст
		
		word1 = new Word("Предложения");
		word2 = new Word("образуют");
		word3 = new Word("текст");
		
		sentence = new Sentence();
		sentence.addValue(word1);
		sentence.addValue(word2);
		sentence.addValue(word3);
		
		text.addValue(sentence);  // добавление предложения в текст
		text.addValue(new Word("Конец"));  // добавление слова в текст
		
		System.out.println(text.getHeader());
		System.out.println(text.getValue());

	}

}
