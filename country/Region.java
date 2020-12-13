package by.tce.lonline.country;

import java.util.ArrayList;

/* Модуль 4. Агрегация и композиция. Задача 3
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Region { // Область
	private String name; // название области
	private String regionCentreName; // областной центр
	private int area = 0; // площадь области
	ArrayList<District> districts = new ArrayList<>(); // список районов

	public Region(String name, int area, String districtName, String regionCentreName) {
		super();
		this.name = name;
		this.area = area;
		this.regionCentreName = regionCentreName;
		// Область должна иметь хотя бы один район
		districts.add(new District(districtName, regionCentreName));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionCentreName() {
		return regionCentreName;
	}

	public void setRegionCentreName(String regionCentreName) {
		this.regionCentreName = regionCentreName;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public ArrayList<District> getDistricts() {// возвращает список районов
		return districts;
	}
	
	// добавление района
	public void addDistrict(String districtName, String districtCentreName) {
		districts.add(new District(districtName, districtCentreName));
	}

}
