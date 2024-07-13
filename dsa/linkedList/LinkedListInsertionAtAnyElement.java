package dsa.linkedList;
import java.util.Scanner;

//insertion after an element 
public class LinkedListInsertionAtAnyElement {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.print("Enter the number of elements you want to enter in LL = ");
        int n = scanner.nextInt();

        for(int i = 0 ; i<n ;i++){
            linkedList.insert(scanner.nextInt());
        }
        linkedList.printList();

        System.out.print("\nEnter the element after which you want to insert =");
        int element = scanner.nextInt();
        System.out.print("Enter the element = ");
        int data = scanner.nextInt();
        linkedList.insertAfterAnyElement(element, data);
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
    void insertAfterAnyElement(int element , int data){
        Node currNode = head;
        Node newNode = new Node(data);

            // Traverse the list until the node with the specified element is found
            while (currNode != null && currNode.data != element){
                currNode = currNode.next;
            }if(currNode != null){
                newNode.next = currNode.next;
                currNode.next = newNode;
            }
    }

    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node currNode = head;
            while(currNode.next != null){
                currNode  = currNode.next;
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
}
