package basics;

//Program to Implement Stack
public class P043 {

	public static void main(String[] args) {
		
		Stack st=new Stack();
		for(int i=1;i<10;i++) {
			st.push(i);
		}
		st.pop();
		st.pop();
		st.push(10);
		for(int i=10;i<30;i++) {
			st.push(i);
		}
		st.printStack();
	}

}

class Stack {
	int capacity = 10;
	int[] array = null;
	int pointer = -1;

	public Stack() {

		this(10);
	}

	public Stack(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
	}

	public void push(int item) {
		pointer++;
		if (pointer == capacity) {
			// double the array and copy
			int newCapacity=capacity * 2;
			int[] newArray = new int[newCapacity];

			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			capacity=newCapacity;
		}
		
		array[pointer] = item;

	}

	public int pop() {
		if (pointer == -1) {
			System.err.println("Stack is empty not posible to pop");

			return -1;
		}
		return array[pointer--];

	}

	public void printStack() {
		int temp = pointer;
		while (temp >= 0) {
			System.out.println(array[temp--]);
		}
	}
}
