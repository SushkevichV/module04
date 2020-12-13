package by.tce.jonline.account;

import java.util.ArrayList;

/* Модуль 4. Агрегация и композиция. Задача 4
 * Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Client {
	private String name;
	private String surname;
	private ArrayList<Account> accounts = new ArrayList<>();
	
	// новый клиент
	public Client(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	// новый счет
	public void addAccount(String number, double balance, double overdraft) {
		accounts.add(new Account(number, balance, overdraft));
		sort();
	}
	
	// движение по счету
	public void operation(String number, double amount) {
		if (findAccount(number)<0) {
			System.out.println("Счет не найден");
		} else {
			accounts.get(findAccount(number)).setBalance(amount);
		}
	}
	
	// блокировка/разблокировка
	public void lock(String number) {
		if (findAccount(number)<0) {
			System.out.println("Счет не найден");
		} else {
			accounts.get(findAccount(number)).setLocked();
		}
	}
	
	// установка овердрафта
	public void setOverdraft(String number, double overdraft) {
		if (findAccount(number)<0) {
			System.out.println("Счет не найден");
		} else {
			accounts.get(findAccount(number)).setOverdraft(overdraft);
		}
	}
	
	// сортировка
	private void sort() {
		if(accounts.size()>1) {
			for (int i=0; i<accounts.size(); i++) {
				String max=accounts.get(i).getNumber();
				int maxI=i;
				
				for (int j=i+1; j<accounts.size(); j++) {
					if (max.compareTo(accounts.get(j).getNumber())>0) {
						max=accounts.get(j).getNumber();
						maxI=j;
					}
				}
				if (i!=maxI) {
					Account tmp=accounts.get(i);
					accounts.set(i, accounts.get(maxI));
					accounts.set(maxI, tmp);
				}
			}
		}
	}
	
	// информация по номеру счета
	public void serch(String number) {
		System.out.println("Поиск по номеру счета:");
		if (findAccount(number)<0) {
			System.out.println("Счет не найден");
		} else {
			//System.out.printf("Счет № %s | остаток на счете: %.2f | овердрафт: %.2f | статус: %s\n", accounts.get(id).getNumber(), accounts.get(id).getBalance(), accounts.get(id).getOverdraft(), accounts.get(id).isLocked()? "заблокирован" : "активен");
			System.out.println(accounts.get(findAccount(number)).toString());
		}
	}
	
	// поиск счета по номеру
	private int findAccount(String number) {
		int id=-1;
		
		for (int i=0; i<accounts.size(); i++) {
			if(number==accounts.get(i).getNumber()) {
				id=i;
				break;
			}
		}
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public double getBalance() { // общий баланс
		double balance=0;
		
		for (int i=0; i<accounts.size(); i++) {
			balance += accounts.get(i).getBalance();
		}
		return balance;
	}

	public double getPositive() { // общий баланс счетов с положительным остатком
		double balance=0;
		
		for (int i=0; i<accounts.size(); i++) {
			if (accounts.get(i).getBalance()>0) {
				balance += accounts.get(i).getBalance();
			}
		}
		return balance;
	}
	
	public double getNegative() { // общий баланс счетов с отрицательным остатком
		double balance=0;
		
		for (int i=0; i<accounts.size(); i++) {
			if (accounts.get(i).getBalance()<0) {
				balance += accounts.get(i).getBalance();
			}
		}
		return balance;
	}

	public void report() { // список счетов клиента
		System.out.println("Список счетов клиента");	
		for (int i=0; i<accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}
}
