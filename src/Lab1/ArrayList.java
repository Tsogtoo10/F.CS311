package Lab1;

import java.util.Scanner;

public class ArrayList {
	Scanner sc = new Scanner(System.in);
	Object st[];
	int size;
	int cap;
	

	public ArrayList(int c) {
		st = new Object[c];
		cap = c;
		size = 0;
	}

	public ArrayList() {
		this(10);
	}

	public void empty() {
		if (size == 0)
			System.out.println("Жагсаалт хоосон байна.");
		else
			System.out.println("Жагсаалтын хэмжээ нь "+size+" байна.");
	}
	
	public void checkIndex(int index)
	   {
	      if (index < 0 || index >= size)
	         throw new IndexOutOfBoundsException
	               ("index = " + index + "  size = " + size);
	   }
	
	public Object remove(int index)
	   {
	      checkIndex(index);
	   
	      Object removedElement = st[index];
	      for (int i = index + 1; i < size; i++)
	         st[i-1] = st[i];
	   
	      st[--size] = null;  
	      System.out.println("Элемэнт амжилттай устлаа");
	      return removedElement;
	   }

	
	public void add(Object theObject) {
		System.out.println("Та элемэнтээ оруулна уу?");
		theObject=sc.next();
		st[size] = theObject;
		size++;
		System.out.println("Элемэнт амжилттай нэмэгдлээ");
	}

	public void printList() {
		for (int i = 0; i < size; i++) {
			System.out.println(" " + (Object) st[i]);
		}
	}

	public void menu() {
		System.out.println("===ArrayList DataStructure===" + "\n");
		System.out.println("1)Элемэнт нэмэх");
		System.out.println("2)Элемэнт устгах");
		System.out.println("3)Хэвлэх");
		System.out.println("4)Хэвл");
	}

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int command = 0;
		for (;;) {
			arr.menu();
			System.out.println("Комманд оруулна уу?");
			command = sc.nextInt();
			switch (command) {
			case 1: {
				arr.add(arr);
				break;
			}
			case 2: {
				arr.remove(0);
				break;
			}
			case 3: {
				arr.printList();
				break;
			}
			case 4: {
				arr.empty();
				break;
			}
			}
		}
	}

}
