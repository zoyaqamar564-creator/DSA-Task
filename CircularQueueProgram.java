import java.util.Scanner;

public class CircularQueueProgram {

    static int[] queue = new int[5];

    static int front = -1;
    static int rear = -1;

    // Enqueue operation
    static void enqueue(int value) {

        if ((rear + 1) % queue.length == front) {

            System.out.println("Queue is full.");

        } else {

            if (front == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % queue.length;
            }

            queue[rear] = value;

            System.out.println("Inserted: " + value);
        }
    }

    // Dequeue operation
    static void dequeue() {

        if (front == -1) {

            System.out.println("Queue is empty.");

        } else {

            System.out.println("Removed: " + queue[front]);

            if (front == rear) {

                front = -1;
                rear = -1;

            } else {

                front = (front + 1) % queue.length;
            }
        }
    }

    // Display operation
    static void display() {

        if (front == -1) {

            System.out.println("Queue is empty.");

        } else {

            int i = front;

            while (true) {

                System.out.print(queue[i] + " ");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % queue.length;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("\n--- Circular Queue ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.print("Enter print job number: ");
                int value = input.nextInt();

                enqueue(value);

            }

            else if (choice == 2) {

                dequeue();

            }

            else if (choice == 3) {

                display();

            }

            else if (choice == 4) {

                System.out.println("Program ended.");
                break;

            }

            else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}