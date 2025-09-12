package threadspackage;

public class ThreadTimeMain {
    class ThreadTime1 implements Runnable{
        public void run(){    
            for(;;){   
            try{Thread.sleep(15000);}catch(InterruptedException e){System.out.println(e);}    
            System.out.println("Thread 1__");    
            }    
        }   
        
    class ThreadTime2 implements Runnable {
        public void run() {
            for (;;) {
                try{Thread.sleep(15000);}catch(InterruptedException e){System.out.println(e);}
                Thread.
            System.out.println("Thread 2__");
                }
            }
        }
    // class ThreadTime2 implements Runnable
    //    public void run(){    
    //     for(;;){   
    //     //   try{Thread.sleep(15000);}catch(InterruptedException e){System.out.println(e);}    
    //       System.out.println("Thread 2__");    
    //     }    

        public static void main(String args[]){
            ThreadTime1 threadTime1 = new ThreadTime1();
            Thread thread1 = new Thread(threadTime1);
            thread1.start();


        }
       }  
    }
