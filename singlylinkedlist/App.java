package singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList theList = new SinglyLinkedList();
		theList.insertFirst(10);
		theList.insertFirst(20);
		theList.insertFirst(30);
		theList.insertFirst(40);
		theList.insertFirst(50);
		theList.insertLast(60);
		theList.insertLast(70);
		theList.displayList();
		theList.deleteFirst();
		theList.displayList();
	}

}
