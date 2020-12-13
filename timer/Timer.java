package by.tce.jonline.timer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* Модуль 4. Простейшие классы и объекты. Задача 6
 * Составьте описание класса для представления времени. Предусмотрите возможности установки времени 
 * и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут, секунд.
 */

public class Timer {
	DateFormat df = new SimpleDateFormat("HH:mm:ss");
	
	Calendar calendar = Calendar.getInstance();
	
	public Timer() {
		super();
		System.out.println("Текущее время: " + df.format(calendar.getTime()));
	}
	
	public Timer(int hourOfDay, int minute, int second) {
		super();
		calendar.set(0, 0, 0, hourOfDay, minute, second);
		System.out.println("Установленное время: " + df.format(calendar.getTime()));
	}
	
	public void setHour(int hour) {
		if(hour>=0 && hour<=24) {
			calendar.set(Calendar.HOUR_OF_DAY, hour);
		} else {
			calendar.set(Calendar.HOUR_OF_DAY, 0);
		}
		System.out.println("Установленное время: " + df.format(calendar.getTime()));
	}

	public void setMinute(int minute) {
		if(minute>=0 && minute<60) {
			calendar.set(Calendar.MINUTE, minute);
		} else {
			calendar.set(Calendar.MINUTE, 0);
		}
		System.out.println("Установленное время: " + df.format(calendar.getTime()));
	}

	public void setSecond(int second) {
		if(second>=0 && second<60) {
			calendar.set(Calendar.SECOND, second);
		} else {
			calendar.set(Calendar.SECOND, 0);
		}
		System.out.println("Установленное время: " + df.format(calendar.getTime()));
	}

	public void changeHour(int hour) {
		calendar.add(Calendar.HOUR, hour);
		System.out.println("Измененное время: " + df.format(calendar.getTime()));
	}

	public void changeMinute(int minute) {
		calendar.add(Calendar.MINUTE, minute);
		System.out.println("Измененное время: " + df.format(calendar.getTime()));
	}

	public void changeSecond(int second) {
		calendar.add(Calendar.SECOND, second);
		System.out.println("Измененное время: " + df.format(calendar.getTime()));
	}

}
