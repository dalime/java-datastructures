package circularlinkedlist;

public class CircularLinkedList {
	public Node first;
	public Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	private boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			last = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		
		if (first.next == null) {
			last = null;
		}
		
		first = first.next;
		return temp;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void displayList() {
		System.out.println("List first to last: ");
		Node temp = first;
		
		while (temp != null) {
			temp.display();
			temp = temp.next;
		}
		
		System.out.println();
	}
}
