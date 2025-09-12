package dsa.linkedList;

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedListSearch LinkedList = new LinkedListSearch();
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
            }
            currNode.next = newNode;
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


    int search(int data){
        int pos = -1 ;              
        int counter = 0 ;
        Node currNode = head;

        while(currNode.next != null){
            if(currNode.data == data){
                pos = counter ;
                break;
            }else{
                currNode = currNode.next ;
                counter ++;
            }
        }
        return pos;
    }

}
