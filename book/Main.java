package by.tce.jonline.book;

/* Модуль 4. Простейшие классы и объекты. Задача 9
 * Создать класс Book по спецификации. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущеных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {

	public static void main(String[] args) {
		BookList books = new BookList();
		// добавление книги
		books.addBook("Зверобой", "Купер Дж.Ф.", "Нигма", 2017, 480, 48.59, "Твердый переплет");
		
		// изменение цены по id
		books.changePrice(3, 49.98);

		// список книг заданного автора
		System.out.println("Список книг заданного автора");
		// Полное соответствие не требуется. Достаточно фамилии или хотя бы первых ее букв 
		books.selectedShow("Купер");
		
		// список книг, выпущеных заданным издательством
		System.out.printf("\nСписок книг, выпущеных заданным издательством\n");
		// Полное соответствие не требуется. Достаточно первых букв названия издательства
		books.selectedShow("Азбука");
		
		// список книг, выпущенных после заданного года
		System.out.printf("\nСписок книг, выпущенных после заданного года\n");
		books.selectedShow(2016);
		
		// удаление книги
		books.removeBook(6);

	}

}
