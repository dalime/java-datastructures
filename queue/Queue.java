package queue;

public class Queue {
	private int maxSize;
	private long[] queueArr;
	private int front;
	private int rear;
	private int numItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArr = new long[size];
		front = 0;
		rear = -1;
		numItems = 0;
	}
	
	public void insert(long i) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		
		rear++;
		queueArr[rear] = i;
		numItems++;
	}
	
	public long remove() {
		long temp = queueArr[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		numItems--;
		return temp;
	}
	
	public boolean isFull() {
		return (numItems == maxSize);
	}
	
	public boolean isEmpty() {
		return (numItems == 0);
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArr.length; i++) {
			System.out.print(queueArr[i] + " ");
		}
		System.out.print(" ]");
	}
	
	public long seeFront() {
		return queueArr[front];
	}
	
}
