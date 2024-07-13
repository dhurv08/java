package dsa.linkedList;
import java.util.Scanner;
public class LinkedListInsertionStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.print("Enter the number of elements you want to enter in LL = ");
        int n = scanner.nextInt();

        for(int i = 0 ; i<n ;i++){
            linkedList.insert(scanner.nextInt());
        }

        linkedList.printList();
        System.out.print("\nEnter the element to Insert at start =");
        int startElement = scanner.nextInt();
        linkedList.insertStart(startElement);
        linkedList.printList();

        scanner.close();

    }
}
class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
    }
}
class LinkedList{
    Node head;

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }currNode.next = newNode;
        }
    }

    void printList(){
        Node currNode = head;
        System.out.println();
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    void insertStart(int data){
        Node newNode = new Node(data);
        if(head == null){               //If the list is empty, the new node becomes the head of the list.
            head = newNode;
        }else{                             //If the list is not empty, the else block is executed.
            newNode.next = head;        //places the new node in front of the current first node.
            head = newNode;             //updates the head to point to newNode.
        }
    }
}