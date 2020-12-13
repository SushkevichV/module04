package by.tce.jonline.train;

import java.util.Scanner;

/* Модуль 4. Простейшие классы и объекты. Задача 4
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время
 * отправления. Создайте данные в массив из пяти элементов типа Train, добавьте возможность 
 * сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде,
 * номер которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {

	private static Train[] trains = initTrains();
	
	public static void main(String[] args) {
						
		sortByNumber();
		sortByDestination();
		trainInfo();

	}

	private static void trainInfo() {
		int number = console();
		int trainNumber = -1;
		
		for(int i=0; i<trains.length; i++) {
			if(number==trains[i].getTrainNumber()) {
				trainNumber = i;
				break;
			}
		}
		
		if(trainNumber>-1) {
			trains[trainNumber].getInfo();
		} else {
			System.out.println("Извините. Поезда с номером "+number+" не существует.");
		}
		
	}

	private static void sortByDestination() {
		
		for (int i=0; i<trains.length; i++) {
			String max=trains[i].getDestination();
			int maxI=i;
			
			for (int j=i+1; j<trains.length; j++) {
				if (max.compareTo(trains[j].getDestination())>0) {
					max=trains[j].getDestination();
					maxI=j;
				}
			}
			if (i!=maxI) {
				Train tmp=trains[i];
				trains[i]=trains[maxI];
				trains[maxI]=tmp;
			}
		}
		
		for (int i=0; i<trains.length-1; i++) {
			if (trains[i].getDestination().compareTo(trains[i+1].getDestination())==0) {
				if(trains[i].getDepartureTime().after(trains[i+1].getDepartureTime())) {
					Train tmp=trains[i];
					trains[i]=trains[i+1];
					trains[i+1]=tmp;
				}
			}
		}
		
		System.out.printf("%nПоезда по направлениям:%n");
		for(int i=0; i<trains.length; i++) {
			trains[i].getInfo();
		}
		
	}

	private static void sortByNumber() {
		for (int i=0; i<trains.length; i++) {
			int max=trains[i].getTrainNumber();
			int maxI=i;
			
			for (int j=i+1; j<trains.length; j++) {
				if (trains[j].getTrainNumber()<max) {
					max=trains[j].getTrainNumber();
					maxI=j;
				}				
			}
			if (i!=maxI) {
				Train tmp=trains[i];
				trains[i]=trains[maxI];
				trains[maxI]=tmp;
			}
		}
		
		System.out.println("Поезда по номерам:");
		for(int i=0; i<trains.length; i++) {
			trains[i].getInfo();
		}
		
	}

	private static Train[] initTrains() {
		Train[] trains = new Train[5];
		
		trains[0] = new Train("Ромашкино", 1002, (float) 12.45);
		trains[1] = new Train("Васильково", 2815, (float) 14.10);
		trains[2] = new Train("Радужный", 95, (float) 12.15);
		trains[3] = new Train("Ромашкино", 4, (float) 10.05);
		trains[4] = new Train("Васильково", 1204, (float) 9.45);
		
		return trains;
	}
	
	public static int console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.printf("%nИнформацию о каком поезде вы хотите посмотреть? >> ");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.print("Введите номер поезда >> ");
		}
		return scanner.nextInt();
		
	}

}
