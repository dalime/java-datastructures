package singlylinkedlist;

public class SinglyLinkedList {
	public Node first;
	public Node last;
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node temp = first;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		temp.next = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
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
