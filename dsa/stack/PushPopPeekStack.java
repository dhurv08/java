package dsa.stack;

public class PushPopPeekStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print();

        
        stack.pop();
        stack.print();

        // stack.peek();
        System.out.println("Top element of the Stack = "+ stack.peek());
    }
}
class Stack{
    // static int final CAPACITY = 10;
    private static final int CAPACITY = 10;
    int top = -1;
    int a [] = new int[CAPACITY];

    boolean isEmpty(){
        return (top<0);
    }

    Stack(){
        top = -1;
    }

    boolean push(int k){
        if(top >= (CAPACITY -1)){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top++;
            a[top] = k;
            System.out.println("Element "+ k+" pushed into the Stack");
            return true;
        }
    }

    int pop(){
        System.out.print("After popping , ");
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int k = a[top];
            top = top-1;
            return k;
        }
    }

    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int k = a[top];
            return k;
        }
    }

    void print(){

        System.out.println("__Current Stack__");
        for(int i =top ; i> -1 ; i--){
            System.out.println(a[i] + " ");
        }
    }
    
}
