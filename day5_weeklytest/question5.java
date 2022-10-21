/*
    Write a function that creates a singly linked list and prints the middle element of this list
    in one traverse. You are expected to write the implementation of the LinkedList.
    Example:
    1 -> 2 -> 3 -> 4 -> 5 ---- Answer: 3
    2 -> 6 -> 1 -> 3 -> 7 -> 5 ---- Answer: 1
 */

package day5_weeklytest;

public class question5 {
    
    class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public void addNode (int data)
    {

        Node newNode = new Node(data);

        if(head == null )
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public static void displayMiddleNode()
    {

        Node tmp = head;

        Node slowPointer = tmp;
        Node fastPointer = tmp.next;

        while(fastPointer != null && fastPointer.next != null)
        {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        System.out.print(slowPointer.data);

    }

    public static void main(String[] args) {
        
        question5 linkedlist = new question5();

        linkedlist.addNode(1);
        linkedlist.addNode(2);
        linkedlist.addNode(3);
        linkedlist.addNode(4);
        linkedlist.addNode(5);
        // linkedlist.addNode(6);


        displayMiddleNode();

    }

}
