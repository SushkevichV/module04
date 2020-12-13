package by.tce.jonline.train;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* Модуль 4. Простейшие классы и объекты. Задача 4
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
 * отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность 
 * сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
 * номер которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Train {
	private String destination;
	private int trainNumber;
	private Calendar departureTime = new GregorianCalendar();
	
	public Train(String destination, int trainNumber, float departureTime) {
		super();
		int h=(int)departureTime;
		int m=(int)(departureTime*100-h*100);
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime.set(Calendar.HOUR_OF_DAY, h);
		this.departureTime.set(Calendar.MINUTE, m);
	}

	public String getDestination() {
		return destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	public void getInfo() {
		System.out.printf("Поезд № %d до станции \"%s\" отправляется в %02d:%02d%n",this.trainNumber, this.destination, this.departureTime.get(Calendar.HOUR_OF_DAY), this.departureTime.get(Calendar.MINUTE));
		
	}

}
