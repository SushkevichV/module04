package by.tce.jonline.customer;

/* Модуль 4. Простейшие классы и объекты. Задача 8
 * Создать класс Customer по спецификации. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Customer {
	private int id;				// идентификатор - обязательный и неизменный параметр, присваивается автоматически
	private String surname;		// фамилия - обязательный параметр
	private String name;		// имя (и отчество) - необязательный параметр. Отчества может не быть вовсе.
	private long card;			// номер кредитной карты - 16-значное число
	private String acсount;		// номер банковского счета - может содержать буквы
	
	{
		name="";
		card=0;
		acсount="";
	}
	
	public Customer(int id, String surname) { // минимальный набор параметров (МНП)
		super();
		this.id = id;
		this.surname = surname;
	}
	
	public Customer(int id, String surname, String name) { // МНП + имя (и отчество)
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
	}

	public Customer(int id, String surname, String name, long card) { 	// МНП + кредитная карта, на карте обязательно есть имя,
		super();														// так что с картой без имени конструктор не делаем
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.card = card;
	}

	public Customer(int id, String surname, String name, long card, String acсount) { // полный набор параметров 
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.card = card;
		this.acсount = acсount;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCard() {
		return card;
	}

	public void setCard(long card) {
		this.card = card;
	}

	public String getAcсount() {
		return acсount;
	}

	public void setAcсount(String acсount) {
		this.acсount = acсount;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", Фамилия=" + surname + ", Имя и отчество=" + name + ", Номер кредитной карты=" + card + ", Номер банковского счета="
				+ acсount + "]";
	}

	public void show() {
		System.out.printf("%d\t%s %s\t%016d\t%s\n", id, surname, name, card, acсount);
		
	}
	

}
