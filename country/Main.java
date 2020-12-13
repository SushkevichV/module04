package by.tce.lonline.country;

/* Модуль 4. Агрегация и композиция. Задача 3
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Main {
	private static Country country;
	public static void main(String[] args) {
		createCountry("Беларусь", "Минск");
		System.out.println("Столица государства - город "+country.getCapital());
		System.out.println("Занимаемая площадь -  "+country.getArea()+" квадратных километров");
		System.out.println("Количество областей - "+country.regions.size());
		
		country.showRegions();
		

	}

	private static void createCountry(String coutry, String capital) {
		country = new Country(coutry, capital);
		country.addRegion("Миская область", 39854+348, "Минский район", "Минск");
		country.addRegion("Брестская область", 32786, "Брестский район", "Брест");
		country.addRegion("Витебская область", 40051, "Витебский район", "Витебск");
		country.addRegion("Гомельская область", 40372, "Гомельский район", "Гомель");
		country.addRegion("Гродненская область", 25127, "Гродненский район", "Гродно");
		country.addRegion("Могилевская область", 29068, "Могилевский район", "Могилев");
	}

}
