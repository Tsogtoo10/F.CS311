package Lab2;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String a;
		String j[] = new String[10];
		try {
			int command = 0;
			for (;;) {
				arr.menu();
				System.out.println("Комманд оруулна уу?");
				command = sc.nextInt();
				switch (command) {
				case 1: {
					arr.size();
					break;
				}
				case 2: {
					System.out.print("Та утгаа оруулна уу :");
					a = sc.next();
					arr.add(j, a);
					System.out.println("Элемэнт амжилттай нэмэгдлээ.");
					break;
				}
				case 3: {
					System.out.println("Устгах элемэнтийнхээ индексийг оруулна уу :");
					int removed = sc.nextInt();
					arr.remove(j, removed);
					System.out.println("Элемэнт амжилттай устлаа");
					break;
				}
				
				case 4: {
					System.out.println("Indexee oruul");
					int i=sc.nextInt();
					arr.indexOf(j, i);
					break;
				}

				case 5: {
					arr.empty();
					break;
				}
				case 6: {
					arr.printList(j);
					break;
				}
				
				default:
					System.out.println("1-6 хооронд тоо оруулна уу!");

				}
			}
		}

		catch (Exception e) {
			System.out.println("Буруу!");
		}
	}
}
