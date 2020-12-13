package by.tce.jonline.account;

/* Модуль 4. Агрегация и композиция. Задача 4
 * Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account {
	private String number; // номер
	private double balance; // баланс
	private double overdraft; // если 0 - счет не может иметь отрицательный остаток
	private boolean locked; // признак блокировки счета
	
	// новый счет
	public Account(String number, double balance, double overdraft) {
		super();
		this.number = number;
		this.overdraft = Math.abs(overdraft); // овердрафт нельзя установить отрицательным
		this.balance = (double)(Math.round(balance*100))/100; // начальный остаток, на случай, если число имеет слишком длинную дробную часть
		locked=false; // счет изначально не заблокирован
	}

	public double getBalance() { // получить остаток на счете
		return balance;
	}

	public void setBalance(double amount) { // движение по счету (+ зачисление / - списание)
		amount=(double)(Math.round(amount*100))/100; // на случай, если число имеет слишком длинную дробную часть
		if(amount<0) { // если сумма отрицательная - списание со счета
			if(locked) {
				System.out.println("Операция не может быть выполнена. Счет заблокирован.");
			} else {
				if(balance+amount<balance+overdraft) { // проверяем текущий баланс и овердрафт
					System.out.println("Операция не может быть выполнена. Превышен лимит по счету.");
				} else {
					balance += amount;
					System.out.println("Со счета списано "+amount);
				}
			}
		} else {
			balance += amount;
			System.out.println("На счет зачислено "+amount);
		}
		System.out.println("Остаток на счете: "+balance);
		System.out.println();
	}

	public double getOverdraft() { // проверка овердрафта по счету
		return overdraft;
	}

	public void setOverdraft(double overdraft) { // снять / установить овердрафт
		overdraft=(double)(Math.round(overdraft*100))/100; // на случай, если число имеет слишком длинную дробную часть
		this.overdraft = Math.abs(overdraft);
		if(balance<0) { 						// если баланс < 0
			if(-balance>this.overdraft) { 	// если текущая задолженность больше установленного овердрафта
				locked=true;					// счет блокируется
			}
		}
		System.out.println("Овердафт в размере "+ this.overdraft +" установлен");
		System.out.println();
	}

	public boolean isLocked() { // проверка блокировки счета
		return locked;
	}

	public void setLocked() { // заблокировать/разблокировть счет
		locked = !locked;	// при вызове статус меняется на противоположный
	}

	public String getNumber() { // получить номер счета
		return number;
	}
	
	@Override
	public String toString() {
		String report;
		report = "Счет № " + number + " | остаток на счете: " + balance + "\t | овердрафт: " + overdraft + "\t | статус: ";
		if (locked) {
			report += "заблокирован";
		} else {
			report += "активен";
		}
		return report;
	}
	
}
