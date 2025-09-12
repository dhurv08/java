package dsa.queue;
import java.util.Scanner;
public class QueueArray{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Queuearray queue = new Queuearray();

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
class Queuearray{
    private int CAPACITY = 100;
    private int a[];
    private int front; 
    private int rear;

    Queuearray(){
        a = new int[CAPACITY];
        front = 0;
        rear = -1;
    }

    void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        a[rear] = element;

    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = 0 ; i<rear ;i++){
            a[i] = a[i+1];
        }
        rear --;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            return a[front];
        }
    } 
    void print(){
        System.out.print("Current Queue = ");
        for(int i = front ; i<=rear ; i++){
            System.out.print(a[i] + "   ");
        }System.out.println();
    }

    boolean isEmpty(){
        return (rear < front);
    }

    boolean isFull(){
        return  (rear == (CAPACITY -1));
    }
}