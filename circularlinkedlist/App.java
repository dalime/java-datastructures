package circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList theList = new CircularLinkedList();
		theList.insertFirst(10);
		theList.insertFirst(20);
		theList.insertLast(30);
		theList.insertLast(40);
		theList.displayList();
		theList.deleteFirst();
		theList.displayList();
	}

}
