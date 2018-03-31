package stack;

public class Stack {
	private int maxSize;
	private int top;
	private char[] stackArr;
	
	public Stack(int size) {
		this.maxSize = size;
		this.top = -1;
		this.stackArr = new char[maxSize];
	}
	
	public boolean isFull() {
		return (maxSize - 1 == top);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(char i) {
		if (isFull()) {
			System.out.println("This stack is full.");
		} else {
			top++;
			stackArr[top] = i;
		}
	}
	
	public char pop() {
		if (isEmpty()) {
			System.out.println("This stack is empty.");
			return 'O';
		} else {
			int prevTop = top;
			top--;
			return stackArr[prevTop];
		}
	}
	
	public char peak() {
		return stackArr[top];
	}
}
