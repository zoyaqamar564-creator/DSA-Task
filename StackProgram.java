class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackProgram {

    StackNode top = null;

    // Push operation
    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Removed: " + top.data);
            top = top.next;
        }
    }

    // Display operation
    void display() {
        StackNode temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackProgram s = new StackProgram();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack:");
        s.display();

        s.pop();

        System.out.println("After pop:");
        s.display();
    }
}