class ThreadPrg2 {
    
    public static void main(String args[]) {

        ThreadWait tw = new ThreadWait();

        Thread3 thread3 = new Thread3(tw);
        Thread4 thread4 = new Thread4(tw);
        //on, start
        thread4.start();
        thread3.start();
    }
}

class Thread3 extends Thread {

    ThreadWait tw;

    Thread3(ThreadWait tw) {
        this.tw = tw;
    }

    public void run() {
        System.out.println("In Thread3");
        tw.part1();
    }
}

class Thread4 extends Thread {
    ThreadWait tw;

    Thread4(ThreadWait tw) {
        this.tw = tw;
    }

    public void run() {
        System.out.println("In Thread4");
        tw.part2();
    }
}

class ThreadWait {

    static boolean part1Done = false;
 
    // method synchronized on this
    synchronized void part1() {
        System.out.println("Part 1 Starts");
        try {  
            //5 seconds = 5000 milliseconds
            Thread.sleep(5000);  
        } catch(Exception e) {
            System.out.println(e);
        }  
        part1Done = true;
        System.out.println("Part 1 Done");
        // notify the waiting thread, if any
        notify();
    }
 
    // method synchronized on this
    synchronized void part2() {
        // loop to prevent spurious wake-up
        while (!part1Done) {
            try {
                System.out.println("Thread t4 waiting");
                // wait till notify is called
                wait();
                System.out.println("Thread t4 running again");
            }
            catch (Exception e) {
                System.out.println("Exception in part2() in ThreadWait");
            }
        }
        System.out.println("Completed Part2");
    }
}