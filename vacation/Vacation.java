package by.tce.jonline.vacation;

/* Модуль 4. Агрегация и композиция. Задача 5
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку
 * путевок
 */

public class Vacation {
	private String type; // тип путевки
	private String transport; // вид транспорта
	private int days; // количество днец
	private String feeding; // питание
	private String country; // страна
	private String info; // описание
	private double cost; // стоимость
	
	public Vacation(String type, String transport, int days, String feeding, String country, String info, double cost) {
		super();
		this.type = type;
		this.transport = transport;
		this.days = days;
		this.feeding = feeding;
		this.country = country;
		this.info = info;
		this.cost = cost;
	}
	
	public String getType() {
		return type;
	}

	public String getTransport() {
		return transport;
	}

	public int getDays() {
		return days;
	}

	public String getFeeding() {
		return feeding;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Тип: " + type + "\t | Транспорт: " + transport + "\t | Количество дней: " + days + "\t | Питание: " + feeding
				+ "\t | Страна: " + country + "\t | Описание " + info + "\t | Стоимость: " + cost;
	}

}
