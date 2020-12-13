package by.tce.jonline.account;

/* Модуль 4. Агрегация и композиция. Задача 4
 * Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ivan", "Ivanov");
		
		clientInit(client);
		
		client.serch("BY49BLBB000000000000000001"); // поиск по номеру счета
		
		System.out.printf("\nДанные клиента %s %s\n", client.getName(), client.getSurname());
		
		System.out.printf("Текущий остаток по всем счетам: %.2f\n", client.getBalance());
		
		System.out.printf("Остаток по счетам, имеющим положительный баланс: %.2f\n", client.getPositive());
		
		System.out.printf("Остаток по счетам, имеющим отрицательный баланс: %.2f\n", client.getNegative());
		
		client.report(); // список всех счетов
		
		//-----------------
		// Далее идут методы работы со счетами.
		System.out.println();
		client.setOverdraft("BY49BLBB000000000000000001", 0); // установка лимита овердрафта
		
		client.operation("BY49BLBB000000000000000001", -100); // операция списания со счета
		
		client.operation("BY49BLBB000000000000000001", 100); // операция зачисления на счет
		
		client.lock("BY56BLBB000000000000000004"); // блокировка/разблокировка счета
		
		client.report(); 

	}

	private static void clientInit(Client client) { // инициализация
		client.addAccount("BY49BLBB000000000000000001", -10.58, 500.0);
		client.addAccount("BY74BLBB000000000000000002", 542.12, 0.0);
		client.addAccount("BY89BLBB000000000000000003", 40.42, 0.0);
		client.addAccount("BY56BLBB000000000000000004", 0.0, 10000.0);
		
	}

}
