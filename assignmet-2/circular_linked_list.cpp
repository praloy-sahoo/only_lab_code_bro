#include <bits/stdc++.h>
using namespace std;

class CircularLinkedList {
private:
    // Node structure
    struct Node {
        int data;
        Node* next;

        Node(int d) {
            data = d;
            next = NULL;
        }
    };

    Node* head;

public:
    CircularLinkedList() {
        head = NULL;
    }

    // Insert at end
    void insert(int data) {
        Node* newNode = new Node(data);

        if (head == NULL) {
            head = newNode;
            newNode->next = head;   // circular link
            return;
        }
      // there is no new node so it  point to itself 

        Node* temp = head;
        while (temp->next != head) {
            temp = temp->next;
        }
        // it reaches the last node
      
        temp->next = newNode;
        newNode->next = head;
    }

    // Sum of even elements
    int sumOfEvenElements() {
        if (head == NULL)
            return 0;

        int sum = 0;
        Node* temp = head;

        do {
            if (temp->data % 2 == 0) {
                sum += temp->data;
            }
            temp = temp->next;
        } while (temp != head);

        return sum;
    }

    // Display list
    void display() {
        if (head == NULL) {
            cout << "List is empty\n";
            return;
        }

        Node* temp = head;
        do {
            cout << temp->data << " ";
            temp = temp->next;
        } while (temp != head);

        cout << endl;
    }
};

int main() {
    CircularLinkedList list;

    list.insert(10);
    list.insert(15);
    list.insert(20);
    list.insert(25);
    list.insert(30);

    cout << "Circular List: ";
    list.display();

    cout << "Sum of even elements: " << list.sumOfEvenElements() << endl;

    return 0;
}
