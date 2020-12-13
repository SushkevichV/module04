package by.tce.jonline.book;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Модуль 4. Простейшие классы и объекты. Задача 9
 * Создать класс Book по спецификации. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущеных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class BookList {
	ArrayList<Book> books = new ArrayList<>();
	
	{ // инициализация начального списка
		books.add(new Book(books.size()+1, "Java 8 Полное руководство", "Шилдт Г.", "Издательский дом \"Вильямс\"", 2015, 1376, 154.20, "Твердый переплет"));
		books.add(new Book(books.size()+1, "Философия Java", "Эккель Б.", "Питер", 2019, 1168, 79.65, "Твердый переплет"));
		books.add(new Book(books.size()+1, "Последний из могикан", "Купер Дж.Ф.", "Азбука", 2019, 416, 9.44, "Твердый переплет"));
		books.add(new Book(books.size()+1, "Дети капитана Гранта", "Верн Ж.", "Азбука", 2018, 640, 51.56, "Твердый переплет"));
		books.add(new Book(books.size()+1, "Великий Гэтсби", "Фицджеральд Ф.С.", "Азбука", 2018, 846, 25.87, "Твердый переплет"));
	}
	// добавление книги с автоматическим присвоением id
	public void addBook(String title, String author, String publishing, int year, int page, double price,
			String cover) {
		
		books.add(new Book(books.size()+1, title, author, publishing, year, page, price, cover));
	}
	// изменение цены
	public void changePrice(int id, double price) {
		for (int i=0; i<books.size(); i++) {
			if(books.get(i).getId()==id) {
				books.get(i).setPrice(price);
				break;
			}
		}
	}
	// удаление книги
	public void removeBook(int id) {
		for (int i=0; i<books.size(); i++) {
			if(books.get(i).getId()==id) {
				System.out.printf("\nКнига с id %d: %s, %s удалена\n", books.get(i).getId(), books.get(i).getTitle(), books.get(i).getAuthor());
				books.remove(i);
				break;
			}
		}
	}
	// вывод полного списка книг
	public void showAll() {
		System.out.println("Полный список книг:");
		for (int i=0; i<books.size(); i++) {
			books.get(i).show();
		}
	}
	// вывод выборочного списка
	public void selectedShow(String str) {
		int count = 0;
		Pattern pattern = Pattern.compile(str+".*");
		for (int i=0; i<books.size(); i++) {
			Matcher matcher = pattern.matcher(books.get(i).getAuthor());
			if(matcher.find()) {
				books.get(i).show();
				count++;
			}
			matcher = pattern.matcher(books.get(i).getPublishing());
			if(matcher.find()) {
				books.get(i).show();
				count++;
			}
		}
		if (count==0) {
			System.out.println("Книги не найдены");
		}
	}
	// вывод выборочного списка
	public void selectedShow(int date) {
		int count = 0;
		for (int i=0; i<books.size(); i++) {
			if(books.get(i).getYear()>date) {
				books.get(i).show();
				count++;
			}
		}
		if (count==0) {
			System.out.println("Книги не найдены");
		}
	}

}
