import java.util.Scanner;

public class ArrayProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] marks = new int[10];
        int size = 0;
        int choice;

        while (true) {

            System.out.println("\n--- Student Marks Array ---");
            System.out.println("1. Insert Mark");
            System.out.println("2. Display Marks");
            System.out.println("3. Search Mark");
            System.out.println("4. Delete Mark");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Insert
            if (choice == 1) {

                if (size < marks.length) {

                    System.out.print("Enter marks: ");
                    marks[size] = input.nextInt();

                    size++;

                    System.out.println("Mark inserted.");

                } else {
                    System.out.println("Array is full.");
                }

            }

            // Display
            else if (choice == 2) {

                System.out.println("Student Marks:");

                int i = 0;

                while (i < size) {
                    System.out.print(marks[i] + " ");
                    i++;
                }

                System.out.println();
            }

            // Search
            else if (choice == 3) {

                System.out.print("Enter mark to search: ");
                int search = input.nextInt();

                int i = 0;
                boolean found = false;

                while (i < size) {

                    if (marks[i] == search) {

                        System.out.println("Mark found at index " + i);
                        found = true;
                        break;
                    }

                    i++;
                }

                if (!found) {
                    System.out.println("Mark not found.");
                }
            }

            // Delete
            else if (choice == 4) {

                System.out.print("Enter mark to delete: ");
                int delete = input.nextInt();

                int i = 0;
                boolean found = false;

                while (i < size) {

                    if (marks[i] == delete) {

                        int j = i;

                        while (j < size - 1) {
                            marks[j] = marks[j + 1];
                            j++;
                        }

                        size--;
                        found = true;

                        System.out.println("Mark deleted.");
                        break;
                    }

                    i++;
                }

                if (!found) {
                    System.out.println("Mark not found.");
                }
            }

            // Exit
            else if (choice == 5) {

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