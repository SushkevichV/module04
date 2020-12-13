package by.tce.jonline.airline;

import java.util.ArrayList;

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

public class Airlines {
	private ArrayList<Airline> flights = new ArrayList<>();
	
	{
		flights.add(new Airline("Munich", "B2 895", "Embraer 175", 16.05f, new String[]{"ПН"}));
		flights.add(new Airline("Moscow", "B2 951", "Boeing 737", 12.35f, new String[]{"ПН","СР","ПТ"}));
		flights.add(new Airline("Minsk", "B2 952", "Boeing 737", 14.45f, new String[]{"ПН","СР","ПТ"}));
		flights.add(new Airline("Munich", "B2 705", "Embraer 175", 9.00f, new String[]{"ПН"}));
		flights.add(new Airline("Istanbul", "TK8796", "Boeing 777", 9.20f, new String[]{"ВТ","ЧТ"}));
		flights.add(new Airline("Moscow", "B2 715", "Boeing 737", 9.40f, new String[]{"ВТ","ЧТ","СБ"}));
		flights.add(new Airline("Munich", "KL 1801", "Boeing 737", 10.30f, new String[]{"ПН","СР","ПТ"}));
		flights.add(new Airline("Istanbul", "TK286", "Boeing 777", 21.40f, new String[]{"ВТ","ЧТ"}));
	}
	
	public void addFlight(String destination, String flight, String type, float time, String[] days) {
		flights.add(new Airline(destination, flight, type, time, days));
		System.out.println("Рейс номер "+flight+" добавлен.");
		System.out.println();
	}
	
	public void removeFlight(String flight) {
		for(int i=0; i<flights.size(); i++) {
			if(flights.get(i).getFlight().equals(flight)) {
				System.out.println("Рейс номер "+flight+" удален.");
				flights.remove(i);
				break;
			}
		}
	}
	
	// список рейсов для заданного пункта назначения
	public void selectedDestination(String destination) {
		System.out.println("Список рейсов для пункта назначения - "+destination);
		for(int i=0; i<flights.size(); i++) {
			if(flights.get(i).getDestination().equals(destination)) {
				flights.get(i).show();
			}
		}
		System.out.println();
	}
	
	// список рейсов для заданного дня недели
	public void selectedDay(String d) {
		String day = "";
		switch(d) {
		case("ПН"):{
			day="понедельникам";
			break;
		}
		case("ВТ"):{
			day="вторникам";
			break;
		}case("СР"):{
			day="средам";
			break;
		}
		case("ЧТ"):{
			day="четвергам";
			break;
		}
		case("ПТ"):{
			day="пятницам";
			break;
		}
		case("СБ"):{
			day="субботам";
			break;
		}
		case("ВС"):{
			day="воскресеньям";
			break;
		}
		}
		System.out.println("Список рейсов, осуществляемых по "+day);
		for(int i=0; i<flights.size(); i++) {
			String[] days = flights.get(i).getDays(); 
			for(int j=0; j<days.length; j++){
				if(days[j]==d){
					flights.get(i).show();
					break;
				}
			}
		}
		System.out.println();
	}
	
	
	// список рейсов для заданного дня недели, время вылета для которых более заданного
	public void selectedDay(String d, float time) {
		String day = "";
		int h = Math.round(time); // перевод времени в формат, удобный для восприятия 
		int m = Math.round((time-h)*100);
		
		switch(d) { // перевод дней недели в формат, удобный для восприятия
			case("ПН"):{
				day="понедельникам";
				break;
			}
			case("ВТ"):{
				day="вторникам";
				break;
			}case("СР"):{
				day="средам";
				break;
			}
			case("ЧТ"):{
				day="четвергам";
				break;
			}
			case("ПТ"):{
				day="пятницам";
				break;
			}
			case("СБ"):{
				day="субботам";
				break;
			}
			case("ВС"):{
				day="воскресеньям";
				break;
			}
		}
		
		System.out.printf("Список рейсов, осуществляемых по %s после %02d:%02d\n", day, h, m);
		for(int i=0; i<flights.size(); i++) {
			String[] days = flights.get(i).getDays(); 
			for(int j=0; j<days.length; j++){
				if(days[j]==d){
					if(flights.get(i).getTime()>time) {
						flights.get(i).show();
					}
				}
			}
		}
		System.out.println();
	}

}
