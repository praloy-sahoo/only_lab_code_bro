/*
Print the sum of all even numbers stored in a circular linked list. Represent Node as an inner class.
Collection classes are NOT allowed.
*/





import java.util.Scanner;

public class Ques2 {

    class circular_link {

        class node {
            int data;
            node next;

            node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        node head = null;

        void insert(int data) {
            node newNode = new node(data);

            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }

            node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }

        int sumOfEvenElements() {
            if (head == null) return 0;

            int sum = 0;
            node temp = head;

            do {
                if (temp.data % 2 == 0) { 
                    sum += temp.data;
                }
                temp = temp.next;
            } while (temp != head);

            return sum;
        }

        void display() {
            if (head == null) return;

            node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ques2 obj = new Ques2();
        circular_link list = obj.new circular_link();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        list.display();
        System.out.println("Sum of even elements: " + list.sumOfEvenElements());
    }
}

