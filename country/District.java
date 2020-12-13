package by.tce.lonline.country;

/* Модуль 4. Агрегация и композиция. Задача 3
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class District { // район
	private String name; // название района
	private String districtCentreName; // районный центр
	
	public District(String name, String districtCentreName) {
		super();
		this.name = name;
		this.districtCentreName = districtCentreName;
		// Район обязательно должен иметь хотя бы один город, который и будет районным центром
		City districtCentre = new City(districtCentreName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
