package stack;

public class App {

	public static void main(String[] args) {
		Stack myStack = new Stack(7);
		myStack.push('h');
		myStack.push('o');
		myStack.push('w');
		myStack.push('d');
		myStack.push('y');
		myStack.push('p');
		myStack.push('a');
		myStack.push('r');
		
		while (!myStack.isEmpty()) {
			char value = myStack.pop();
			System.out.println(value);
		}
		
		String test = reverseString("howdy");
		System.out.println(test);
	}
	
	public static String reverseString(String str) {
		int stackSize = str.length();
		Stack myStack = new Stack(stackSize);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			myStack.push(c);
		}
		
		String result = "";
		while (!myStack.isEmpty()) {
			char c = myStack.pop();
			result = result + c;
		}
		
		return result;
	}

}
