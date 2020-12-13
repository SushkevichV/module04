package by.tce.jonline.customer;

import java.util.ArrayList;

/* Модуль 4. Простейшие классы и объекты. Задача 8
 * Создать класс Customer по спецификации. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class CustomerList {
	//private String surname;	// фамилия - обязательный параметр
	//private String name;		// имя (и отчество) - необязательный параметр. Отчества может не быть вовсе.
	//private long card;		// номер кредитной карты - 16-значное число
	//private String account;	// номер банковского счета - может содержать буквы
	private ArrayList<Customer> customers = new ArrayList<>();
	
	{			
		customers.add(new Customer(customers.size()+1, "Иванов", "Дмитрий Андреевич")); // инициализация с автонумератором
		customers.add(new Customer(customers.size()+1, "Смоляков", "Филипп Андреевич", 4808741216111512L));
		customers.add(new Customer(customers.size()+1, "Сидоров", "Алексей Петрович", 4808741216112345L));
		customers.add(new Customer(customers.size()+1, "Петров", "Анатолий Иванович", 4808741216116424L, "BY98AKBB36021010000970000000"));
		
	}

	public void addCustomer(String surname) { // минимальный набор параметров (МНП)
		customers.add(new Customer(customers.size()+1, surname));
	}

	public void addCustomer(String surname, String name) { // МНП + имя (и отчество)
		customers.add(new Customer(customers.size()+1, surname, name));
	}

	public void addCustomer(String surname, String name, long card) { 	// МНП + кредитная карта, на карте обязательно есть имя,
		customers.add(new Customer(customers.size()+1, surname, name, card));
	}

	public void addCustomer(String surname, String name, long card, String acсount) { // полный набор параметров
		customers.add(new Customer(customers.size()+1, surname, name, card, acсount));
	}

	public int getId(int i) {
		return customers.get(i).getId();
	}
	
	public String getSurname(int i) {
		return customers.get(i).getSurname();
	}

	public void setSurname(int i, String surname) { // замена фамилии по ID
		for(int j=0; j<customers.size(); j++) {
			if(customers.get(j).getId()==i) {
				customers.get(j).setSurname(surname);
				break;
			}
		}
	}

	public String getName(int i) {
		return customers.get(i).getName();
	}

	public void setName(int i, String name) { // замена имени по ID
		for(int j=0; j<customers.size(); j++) {
			if(customers.get(j).getId()==i) {
				customers.get(j).setName(name);
				break;
			}
		}
	}

	public long getCard(int i) {
		return customers.get(i).getCard();
	}

	public void setCard(int i, long card) { // замена кредитки по ID
		for(int j=0; j<customers.size(); j++) {
			if(customers.get(j).getId()==i) {
				customers.get(j).setCard(card);
				break;
			}
		}
	}

	public String getAcсount(int i) {
		return customers.get(i).getAcсount();
	}

	public void setAcсount(int i, String acсount) { // замена счета по ID
		for(int j=0; j<customers.size(); j++) {
			if(customers.get(j).getId()==i) {
				customers.get(j).setAcсount(acсount);
			break;
			}
		}
	}

	public void sortCustomers() { // сортировка по фамилии
		for(int i=0; i<customers.size(); i++) {
			String max=customers.get(i).getSurname();
			int maxI=i;
			
			for (int j=i+1; j<customers.size(); j++) {
				if (max.compareTo(customers.get(j).getSurname())>0) {
					max=customers.get(i).getSurname();
					maxI=j;
				}
			}
			if (i!=maxI) {
				Customer tmp=customers.get(i);
				customers.set(i,customers.get(maxI));
				customers.set(maxI,tmp);
			}
		}
	}
	
	public void viewAll() { // вывод всех
		System.out.printf("id\tФамилия Имя Отчество\t\tНомер кредитной карты\tНомер банковского счета\n");
		for(int i=0; i<customers.size(); i++) {
			customers.get(i).show();
		}
	}

	public void selectedView(long min, long max) { // выборка по номеру кредитки
		System.out.print("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале\n");
		System.out.printf("id\tФамилия Имя Отчество\t\tНомер кредитной карты\tНомер банковского счета\n");
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getCard()>min&&customers.get(i).getCard()<max) {
				customers.get(i).show();
			}
		}
	}

	public void removeCustomer(int i) { //удаление покупателя по id
		for(int j=0; j<customers.size(); j++) {
			if(customers.get(j).getId()==i) {
				System.out.printf("\nПокупатель с id %d - %s %s удален. \n", customers.get(j).getId(), customers.get(j).getSurname(), customers.get(j).getName());
				customers.remove(j);
				break;
			}
		}
		
	}
}
