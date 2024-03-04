public class Queue {
    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Метод для добавления элемента в очередь
    public void push(int item) {
        if (isFull()) {
            System.out.println("Очередь переполнена");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Элемент " + item + " добавлен в очередь");
    }

    // Метод для удаления элемента из очереди
    public int delete() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        }
        int removedItem = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return;
        }
        System.out.print("Содержимое очереди: ");
        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
            count--;
        }
        System.out.println();
    }
}
