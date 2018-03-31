package queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(7);
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.insert(50);
		myQueue.insert(60);
		myQueue.insert(70);
		myQueue.insert(80);
		myQueue.insert(90);
		System.out.println("FULL?: " + myQueue.isFull());
		System.out.println("EMPTY?: " + myQueue.isEmpty());
		System.out.println("FRONT: " + myQueue.seeFront());
		
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		myQueue.view();
	}

}
