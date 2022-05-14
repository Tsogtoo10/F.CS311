package Lab2;

import java.util.Scanner;

public class ArrayList<G> {
	Scanner sc = new Scanner(System.in);
	public int size = 0;

	public ArrayList() {

	}

	public void empty() {
		if (size == 0)
			System.out.println("Жагсаалт хоосон байна.");
		else
			System.out.println("Жагсаалтын хэмжээ нь " + size + " байна.");
	}

	public int size() {
		System.out.println("Жагсаалтын урт:" + size);
		return size;
	}

	
	public void checkIndex(int index) { // индекс
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("index = " + index + "  size = " + size);
	}

	public Object indexOf(G[] a,int index) {
		{
			checkIndex(index);
			System.out.println(index + " дугаар индекс дээр " + a[index] + " гэсэн элемэнт байна.");
			return a[index];
		}
	}
	
	public void remove(G[] a, int index) {
		for (int i = index; i < size - 1; i++) {
			a[i] = a[i + 1];
		}
		size--;
	}

	public void printList(G[] a) {
		for (int i = 0; i < size; i++) {
			System.out.println("Элемэнт: " + (Object) a[i]);
		}
	}

	public void add(G[] array, G element) {
		array[size] = element;
		size++;
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

	
}
