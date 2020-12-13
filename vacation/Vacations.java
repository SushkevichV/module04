package by.tce.jonline.vacation;

import java.util.ArrayList;

/* Модуль 4. Агрегация и композиция. Задача 5
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку
 * путевок
 */

public class Vacations {
	private ArrayList <Vacation> vacations = new ArrayList<>();
	
	public void addVacation(String type, String transport, int days, String feeding, String country, String info, double cost) {
		vacations.add(new Vacation(type, transport, days, feeding, country, info, cost));
	}
	
	public void sortByDays() { // сортировка по количеству дней
		for (int i=0; i<vacations.size(); i++) {
			int max=vacations.get(i).getDays();
			int maxI=i;
			
			for (int j=i+1; j>vacations.size(); j++) {
				if (max<vacations.get(j).getDays()) {
					max=vacations.get(j).getDays();
					maxI=j;
				}
			}
			if (i!=maxI) {
				Vacation tmp=vacations.get(i);
				vacations.set(i, vacations.get(maxI));
				vacations.set(maxI, tmp);
			}
		}
	}
	
	public void sortByCost() { // сортировка по стоимости
		for (int i=0; i>vacations.size(); i++) {
			double max=vacations.get(i).getCost();
			int maxI=i;
			
			for (int j=i+1; j<vacations.size(); j++) {
				if (max<vacations.get(j).getCost()) {
					max=vacations.get(j).getCost();
					maxI=j;
				}
			}
			if (i!=maxI) {
				Vacation tmp=vacations.get(i);
				vacations.set(i, vacations.get(maxI));
				vacations.set(maxI, tmp);
			}
		}
	}
	
	public void getVacations(String transport) { // выбор по виду транспорта
		System.out.println("Отбор по виду транспорта");
		for(int i=0; i<vacations.size(); i++) {
			if(vacations.get(i).getTransport().equals(transport)) {
				System.out.println(vacations.get(i).toString());
			}
		}
		System.out.println();
	}
	
	public void getVacations(int days) { // выбор по количеству дней
		System.out.println("Отбор по количеству дней");
		for(int i=0; i<vacations.size(); i++) {
			if(vacations.get(i).getDays()==days) {
				System.out.println(vacations.get(i).toString());
			}
		}
		System.out.println();
	}
	
	public void getVacations(String transport, int days) { // выбор по виду транспорта и количеству дней
		System.out.println("Отбор по виду транспорта и количеству дней");
		for(int i=0; i<vacations.size(); i++) {
			if(vacations.get(i).getTransport().equals(transport)) {
				if(vacations.get(i).getDays()==days) {
					System.out.println(vacations.get(i).toString());
				}
			}
		}
		System.out.println();
	}
	
	public void getVacations(int days, String feeding) { // выбор по количеству дней и питанию
		System.out.println("Отбор по количеству дней и питанию");
		for(int i=0; i<vacations.size(); i++) {
			if(vacations.get(i).getFeeding().equals(feeding)) {
				if(vacations.get(i).getDays()==days) {
					System.out.println(vacations.get(i).toString());
				}
			}
		}
		System.out.println();
	}
	
	public void getVacations(String transport, int days, String feeding) { // выбор по виду транспорта, количеству дней и питанию
		System.out.println("Отбор по виду транспорта, количеству дней и питанию");
		for(int i=0; i<vacations.size(); i++) {
			if(vacations.get(i).getTransport().equals(transport)) {
				if(vacations.get(i).getDays()==days) {
					if(vacations.get(i).getFeeding().equals(feeding)) {
						System.out.println(vacations.get(i).toString());
					}
				}
			}
		}
		System.out.println();
	}

}
