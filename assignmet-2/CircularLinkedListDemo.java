/* ============ OUTER CLASS ============ */
class CircularLinkedList {

    private Node head;

    /* ============ INNER CLASS ============ */
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /* Insert node at end (circular) */
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;   // circular link
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    /* Sum of even elements */
    public int sumOfEvenElements() {
        if (head == null) {
            return 0;
        }

        int sum = 0;
        Node temp = head;

        do {
            if (temp.data % 2 == 0) {
                sum += temp.data;
            }
            temp = temp.next;
        } while (temp != head);

        return sum;
    }

    /* Display list */
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

/* ============ MAIN CLASS ============ */
public class CircularLinkedListDemo {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.insert(30);

        System.out.print("Circular List: ");
        list.display();

        System.out.println("Sum of even elements: " + list.sumOfEvenElements());
    }
}
