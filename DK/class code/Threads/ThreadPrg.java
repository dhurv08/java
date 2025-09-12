//Threads : - Process is a Thread
//Thread can consist muitlple Thread

//to start a Thread we call a function start()
//sleep(), pause for certain ammount of time
//class Thread, start function - Thread( run() method is called )
//synchronise
//wait, pause for uncertain amount of time
//notify, thread which is on wait will be started

class ThreadPrg {

    public static void main(String args[]) {
        PrintValues pv = new PrintValues();

        Thread1 thread1 = new Thread1(pv);
        Thread2 thread2 = new Thread2(pv);

        //on, start
        thread1.start();
        thread2.start();
    }
}

class PrintValues {
    // synchronized void printValues(int n){
    void printValues(int n) { //method not synchronized  
        synchronized(this) {//here particular block of code is synchronized
            for(int i=1;i<=5;i++){
                System.out.println(n+i);  
                try {  
                    //1 second = 1000 milliseconds
                    Thread.sleep(1000);
                } catch(Exception e) {
                    System.out.println(e);
                }  
            }
        }
    }
}

class Thread1 extends Thread {

    PrintValues pv;

    Thread1(PrintValues pv) {
        this.pv = pv;
    }

    public void run() {
        System.out.println("In Thread1");
        pv.printValues(5);
    }
}

class Thread2 extends Thread {
    PrintValues pv;

    Thread2(PrintValues pv) {
        this.pv = pv;
    }

    public void run() {
        System.out.println("In Thread2");
        pv.printValues(15);
    }
}