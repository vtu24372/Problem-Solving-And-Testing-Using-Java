import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

    List() {
        this.head = null;
    }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);   

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {   
            current = current.next;
        }

        current.next = newNode;
    }
}

public class Insert {
    public static void main(String[] args) {

        List list = new List();

        int array[] = {1, 2, 3, 4};

        for (int i : array) {
            list.InsertAtEnd(i);
        }

        list.InsertAtEnd(10);

        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}