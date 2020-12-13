package by.tce.jonline.student;

/* Модуль 4. Простейшие классы и объекты. Задача 3
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
	
	private String name;
	private int group;
	private int[] rating = new int[5];
	
	public Student(String name, int group, int[] rating) {
		super();
		this.name = name;
		this.group = group;
		this.rating = rating;
	}
	
	public void show(int rateMin, int rateMax) {
		boolean show = true;
		
		for(int i=0; i<rating.length; i++) {
			if(rating[i]!=rateMin && rating[i]!=rateMax) { // строгое соответствие. Если нужен диапазон - заменить != на <>
				show=false;
				break;
			}
		}
		if (show) {
			System.out.printf("%s\t  %d%n", this.name, this.group);
		}
		
	}

}
