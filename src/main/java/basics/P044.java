package basics;

//Program to Implement Queue
public class P044 {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.insert(10);

		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.printQueue();
		q.poll();
		q.printQueue();
		q.poll();
		q.printQueue();
	}

}

class Queue {

	int capacity = 10;
	int front = 0;
	int rare = 0;

	int[] array = null;

	Queue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];

	}

	Queue() {
		this(10);
	}

	public void insert(int item) {

		if (rare == capacity) {

			int newCapacity = capacity * 2;
			int[] newArray = new int[newCapacity];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			capacity = newCapacity;
		}
		array[rare++] = item;

	}

	public int poll() {

		if (front == rare) {
			System.err.println("queue is empty");
		}

		return array[front++];
	}

	public void printQueue() {

		int temp = front;
		while (temp < rare) {
			System.out.print(array[temp] + " ");
			temp++;
		}
		System.out.println();
	}

}
