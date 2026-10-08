class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueProgram {

    QueueNode front = null;
    QueueNode rear = null;

    // Enqueue operation
    void enqueue(int data) {

        QueueNode newNode = new QueueNode(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue operation
    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Removed: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    // Display operation
    void display() {

        QueueNode temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueProgram q = new QueueProgram();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");
        q.display();

        q.dequeue();

        System.out.println("After dequeue:");
        q.display();
    }
}