package Lab1;

public class List {
	int st[];
	int size;
	int cap;
public boolean empty() {
	return size == 0;
}
public void push(int theObject) {
st[size] = theObject;
size++;
}

public void add(Object value) {
	
}
	public static void main(String[] args) {
		List list=new List();
		list.push(10);
		list.push(20);
	}
}
