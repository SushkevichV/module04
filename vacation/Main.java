package by.tce.jonline.vacation;

/* Модуль 4. Агрегация и композиция. Задача 5
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку
 * путевок
 */

public class Main {

	public static void main(String[] args) {
		Vacations vacation = new Vacations();
		
		initVacation(vacation); // инициализация
		
		vacation.sortByDays(); // сортировка по количеству дней
		
		vacation.sortByCost(); // сортировка стоимости
		
		vacation.getVacations("Авиа"); // Отбор по виду транспорта
		
		vacation.getVacations(11); // Отбор по количеству дней
		
		vacation.getVacations("Поезд", 10); // Отбор по виду транспорта и количеству дней
		
		vacation.getVacations(10, "FB"); // Отбор по количеству дней и питанию
		
		vacation.getVacations("Авиа", 11, "AI"); // Отбор по виду транспорта, количеству дней и питанию

	}

	private static void initVacation(Vacations vacation) {
		vacation.addVacation("Отдых", "Авиа", 11, "UAI", "Турция", "Отель ****", 2000.00);
		vacation.addVacation("Отдых", "Авиа", 11, "AI", "Египет", "Отель ****", 2000.00);
		vacation.addVacation("Экскурсии", "Авиа", 11, "BB", "Турция", "Отель ****", 2500.00);
		vacation.addVacation("Лечение", "Автобус", 9, "BB", "Чехия", "Отель ****", 2500.00);
		vacation.addVacation("Отдых", "Поезд", 10, "HB", "Россия", "Отель ****", 2000.00);
		vacation.addVacation("Лечение", "Поезд", 10, "AI", "Грузия", "Отель ****", 2000.00);
		vacation.addVacation("Экскурсии", "Поезд", 12, "HB", "Россия", "Отель ****", 2000.00);
		vacation.addVacation("Шопинг", "Авиа", 9, "BB", "Италия", "Отель *****", 3000.00);
		vacation.addVacation("Отдых", "Авиа", 10, "HB", "Италия", "Отель *****", 3500.00);
		vacation.addVacation("Отдых", "Авиа", 11, "AI", "Тайланд", "Отель ****", 3500.00);
		vacation.addVacation("Круиз", "Авиа", 10, "FB", "Греция", "Отель ****", 3500.00);
		vacation.addVacation("Круиз", "Авиа", 10, "FB", "Франция", "Отель ****", 3500.00);
		
	}

}
