package doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(3);
		myList.insertFirst(2);
		myList.insertFirst(1);
		myList.insertLast(4);
		myList.insertLast(5);
		
		myList.displayForward();
		
		myList.deleteFirst();
		myList.displayBackward();
		
		myList.deleteLast();
		myList.displayForward();
		
		myList.deleteKey(3);
		myList.displayForward();
		myList.displayBackward();

	}

}
