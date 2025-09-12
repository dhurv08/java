package dsa.queue;

import java.util.Scanner;

public class QueueLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueuelinkedlistEX queue = new QueuelinkedlistEX();

        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        queue.print();

        queue.dequeue();
        System.out.println("The top element of Queue = " + queue.peek());
        queue.dequeue();
        System.out.println("The top element of Queue = " + queue.peek());
        queue.print();
    }
}
class QueuelinkedlistEX{
    private Node front;
    private Node rear;
    private int size;

    private class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
        }
    }

    void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Inserted " + item);
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to dequeue.");
            return;
        }

        System.out.println("Removed " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return front == null;
    }

    void print() {
        Node current = front;
        System.out.print("Queue = ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
