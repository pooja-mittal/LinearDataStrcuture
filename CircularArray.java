package LinearDataStructure;

public class CircularArray {
	int[] array;
	int front, rear, N;

	public CircularArray() {
		N = 5;
		front = rear = 0;
		array = new int[N];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public int size() {
		return ((N - front + rear) % N);
	}

	public void enqueue(int x) {
		int s = size();
		if (s == N - 1)
			reSize();
		array[rear] = x;
		rear++;
		if (rear == N)
			rear = 0;
	}

	public Integer dequeue() {
		if (isEmpty())
			return null;
		int x = array[front++];
		if (front == N)
			front = 0;
		return x;
	}

	private void reSize() {
		int s = size();
		N = 2 * N;
		int[] arr = new int[N];
		int i = 0;
		int lastIndex = s + 1;
		while (s > 0) {
			arr[i++] = array[front++];
			s--;
			if (front == lastIndex) {
				front = 0;
			}
		}
		rear = i;
		front = 0;
		array = arr;

	}

	public static void main(String[] args) {
		CircularArray ca = new CircularArray();
		ca.enqueue(5);
		ca.enqueue(10);
		ca.enqueue(15);
		ca.dequeue();
		ca.enqueue(25);
		ca.enqueue(7);
		ca.enqueue(3);

		while (!ca.isEmpty()) {
			System.out.println(ca.dequeue());
		}

	}
}
