package by.tce.jonline.student;

/* Модуль 4. Простейшие классы и объекты. Задача 3
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {

	public static void main(String[] args) {
		Student[] students = initStudent();
		showStudents(students, 9, 10);

	}
	
	public static Student[] initStudent() { // инициализация массива типа Student
		Student[] students = new Student[10];
		
		students[0] = new Student("Иванов И.И.", 1, new int[]{8,9,10,9,8});
		students[1] = new Student("Петров П.П.", 2, new int[]{10,9,8,9,10});
		students[2] = new Student("Сидоров А.А.", 3, new int[]{8,9,8,9,8});
		students[3] = new Student("Смирнов С.И.", 1, new int[]{9,9,10,9,10});
		students[4] = new Student("Токарев И.И.", 2, new int[]{10,9,10,9,9});
		students[5] = new Student("Ковалев Н.С.", 3, new int[]{9,9,10,9,8});
		students[6] = new Student("Кораблев К.А.", 1, new int[]{8,9,10,9,8});
		students[7] = new Student("Козлов С.В.", 2, new int[]{10,9,10,9,9});
		students[8] = new Student("Кузнецов Б.А.", 3, new int[]{8,9,10,9,8});
		students[9] = new Student("Быков А.Е.", 1, new int[]{8,9,10,9,8});
		
		return students;

	}
	
	public static void showStudents(Student students[], int rateMin, int rateMax) { // отбор студентов по успеваемости
		
		System.out.printf("Список студентов, имеющих оценки, равные %d или %d:%n", rateMin, rateMax);
		System.out.printf("\nФамилия И.О.\tгруппа\n");
		for(int i = 0; i<students.length; i++) {
			students[i].show(rateMin, rateMax);
		}
		
	}

}
