package Lab1;

import java.util.Scanner;

public class ArrayList {
	Scanner sc = new Scanner(System.in);
	Object st[];
	int size;

	public ArrayList(int c) {
		st = new Object[c];
		size = 0;
	}

	public ArrayList() {
		this(10);
	}

	public int size() {
		System.out.println("Жагсаалтын урт:" + size);
		return size;
	}

	public void empty() {
		if (size == 0)
			System.out.println("Жагсаалт хоосон байна.");
		else
			System.out.println("Жагсаалтын хэмжээ нь " + size + " байна.");
	}

	public void checkIndex(int index) { // индекс
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
	}

	public Object indexOf() {
		{
			System.out.println("Та хайх утгынхаа индексийг оруулна уу?");
			int index = sc.nextInt();
			checkIndex(index);
			System.out.println(index + " дугаар индекс дээр " + st[index] + " гэсэн элемэнт байна.");
			return st[index];
		}
	}

	public Object remove(int index) {
		checkIndex(index);

		Object removedElement = st[index];
		for (int i = index + 1; i < size; i++)
			st[i - 1] = st[i];

		st[--size] = null;
		System.out.println("Элемэнт амжилттай устлаа");
		return removedElement;
	}

	public void add(Object theObject) {
		System.out.println("Та элемэнтээ оруулна уу?");
		theObject = sc.next();
		st[size] = theObject;
		size++;
		System.out.println("Элемэнт амжилттай нэмэгдлээ");
	}

	public void printList() {
		for (int i = 0; i < size; i++) {
			System.out.println("Элемэнт: " + (Object) st[i]);
		}
	}

	public void menu() {
		System.out.println(" \n              ===ArrayList DataStructure===");
		System.out.println("1) Жагсаалтын урт");
		System.out.println("2) Элемент нэмэх");
		System.out.println("3) Элемент устгах");
		System.out.println("4) Индексээр элемэнт харах");
		System.out.println("5) Жагсаалтын хоосон үгүйг мэдэх");
		System.out.println("6) Хэвлэх");
	}

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
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
					arr.add(arr);
					break;
				}
				case 3: {
					arr.remove(0);
					break;
				}
				case 4: {
					arr.indexOf();
					break;
				}
				case 5: {
					arr.empty();
					break;
				}
				case 6:
					arr.printList();
					break;

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