package by.tce.lonline.country;

import java.util.ArrayList;

/* Модуль 4. Агрегация и композиция. Задача 3
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Country { // Государство
	private String name; // Название
	private int area = 0; // площадь
	private String capital; // столица
	ArrayList <Region> regions = new ArrayList<>(); // список областей
	
	public Country(String name, String capital) { // конструктор
		super();
		this.name = name;
		this.capital = capital;
	}
	
	// добавить область
	public void addRegion(String name, int area, String districtName, String regionCentreName) {
		regions.add(new Region(name, area, districtName, regionCentreName));
		this.area+=area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public ArrayList<Region> getRegions() { // возвращает список областей
		return regions;
	}

	public void showRegions() {
		for(int i=0; i<regions.size(); i++) {
			System.out.printf("%s, площадь %d кв.км., областной центр - г.%s\n", regions.get(i).getName(), regions.get(i).getArea(), regions.get(i).getRegionCentreName());
		}
		
	}

}
