package by.tce.jonline.airline;

import java.util.Arrays;

/* Модуль 4. Простейшие классы и объекты. Задача 10
 * Создать класс Airline по спецификации. Определить конструкторы, get- и set- методы и метод 
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых более заданного.
 */

public class Airline {
	private String destination = "";
	private String flight = "";
	private String type = "";
	private float time = 0.0f;
	private String[] days = new String[7];
	
	public Airline(String destination, String flight, String type, float time, String[] days) {
		super();
		this.destination = destination;
		this.flight = flight;
		this.type = type;
		this.time = time;
		this.days = days;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}

	public String getDestination() {
		return destination;
	}

	public String getFlight() {
		return flight;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Airline [пункт назначения=" + destination + ", номер рейса=" + flight + ", тип самолета=" + type + ", время вылета=" + time
				+ ", дни недели=" + Arrays.toString(days) + "]";
	}

	public void show() {
		int h = Math.round(time);
		int m = Math.round((time-h)*100);
		System.out.printf("Пункт назначения - %s, номер рейса - %s, тип самолета - %s, время вылета - %02d:%02d, дни недели - ", destination, flight, type, h, m);
		System.out.print(days[0]);
		for(int i=1; i<days.length; i++) {
			if (days[i]!="") {
				System.out.print(", "+days[i]);
			}
		}
		System.out.println();
	}

}
