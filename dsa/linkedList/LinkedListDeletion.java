package dsa.linkedList;

public class LinkedListDeletion {
    public static void main(String [] argss){

    }
}
class Node{
    int data;
    Node next;

    Node(int d){
        data = d ;
    }
}
class LinkedList{
    Node head;
    void delete(int data){
        
    }

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node currNode = head;
            while (currNode.next != null){
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
}
