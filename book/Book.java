package by.tce.jonline.book;

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

public class Book {
	private int id=0;				// идентификатор
	private String title="";		// название
	private String author="";		// автор
	private String publishing="";	// издательство
	private int year=1800;			// год издания
	private int page=1;				// количество страниц
	private double price=0.0;		// цена
	private String cover="";		// тип переплета
	
	public Book(int id, String title, String author, String publishing, int year, int page, double price,
			String cover) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.year = year;
		this.page = page;
		this.price = price;
		this.cover = cover;
	}
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", название=" + title + ", автор(ы)=" + author + ", издательство=" + publishing + ", год издания="
				+ year + ", количество страниц=" + page + ", цена=" + price + ", тип переплета=" + cover + "]";
	}
	
	public void show() {
		System.out.printf("id %d: %s, %s, издательство \"%s\" %dг., %d страниц, цена %.2fруб., %s\n", id, title, author, publishing, year,
				page, price, cover);
	}
	

}
