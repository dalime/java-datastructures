package doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			last = newNode; // if empty, last will refer to the new node being created
		} else {
			first.previous = newNode;
		}
		
		newNode.next = first; // the new node's next node will point to the old first
		this.first = newNode; // replace this LinkedList's first pointer to newNode
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // assigning old last to newnode
			newNode.previous = last; // the old last will be the newnodes previous
		}
		
		last = newNode; // last field points to new node
	}
	
	// assume that it is a non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) { // there is only one item in the list
			last = null;
		} else { // many items
			first.next.previous = null; // because removing first Node
		}
		
		first = first.next; // changing pointer of first to old first.next
		return temp; // return old first node
	}
	
	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) { // 1 item in LinkedList
			first = null;
		} else { // many items
			last.previous.next = null;
		}
		
		last = last.previous;
		return temp;
	}
	
	// assume non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = first; // start from beginning of list
		while (current.data != key) { // as long as haven't found data in key in particular node
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if (current == last) {
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next; // new node's next field should point to one ahead of current
			current.next.previous = newNode; // node ahead of current's previous field should point to new node
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	// assume non-empty list
	public Node deleteKey(int key) {
		Node current = first; // start from beginning
		while (current.data != key) { // loop through until find key
			current = current.next;
			if (current == null) {
				System.out.println("Sorry, Node not found.");
				return null; // key not found
			} 
		}
		
		if (current == last) { 
			current.previous.next = null; // set the current's previous node's next to nothing
			last = current.previous; // set last pointer to previous node
			current.previous = null; // disconnect the Node
			
		} else if (current == first) {
			first = current.next; // first becomes node after current
			current.next.previous = null; // node after current's previous points to nothing
			current.next = null; // disconnect the Node
		} else {
			Node node1 = current.previous; // the node before current
			Node node2 = current.next; // the node after current
			current.previous.next = node2; // node before current's next points to one after current
			current.next.previous = node1; // node after curren'ts prev points to one before current
			current.next = null; // disconnect the Node
			current.previous = null; // disconnect the Node
		}
		
		return current;
	}
	
	public void displayForward() {
		System.out.print("List (first --> last): ");
		Node current = first;
		while (current.next != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.print("List (last --> first): ");
		Node current = last;
		while (current.previous != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
	
}
