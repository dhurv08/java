package dsa.linkedList;
import java.util.Scanner;
//insertion at last 
public class LinkedLIstTraversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.print("Enter the number of elements you want to enter in LL = ");
        int n = scanner.nextInt();

        for(int i = 0 ; i<n  ; i++){
            linkedList.insert(scanner.nextInt());
            /*
            // in place of this function , we can use 
             
            int data = scanner.nextInt();
            list.insert(data);
            */
        }

        linkedList.printList();
        scanner.close();
    }
}
class Node{
    int data;
    Node next;
    Node(int d ){
        data = d;
    }
}
class LinkedList{
    Node head;
    void insert(int data){
        Node newNode = new Node(data);       //object creation ,  Creates a new node with the given data.

        if(head == null){                   //Checks if the list is empty. If it is, the new node becomes the head of the list.
            head = newNode;
        }
        else                               //else: If the list is not empty:
        {
            Node currNode = head;               //creation of new node and making it the first node by giving it ref to head node ,  Starts from the head of the list.
            while(currNode.next != null){       //Traverses the list to find the last node (the node whose next is null).
                currNode = currNode.next;
            }
            currNode.next = newNode;            //Adds a new node at the end of the list.
        }
    }

    void printList(){
        Node currNode = head;                       //Starts from the head of the list. 
        System.out.println();
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;               //Moves to the next node.
        }
    }
}