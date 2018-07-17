package join;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("поток один");
        NewThread t2 = new NewThread("поток два");
        NewThread t3 = new NewThread("поток три");

        try {
            System.out.println("Wait for threads end");
            System.out.println("Thread 1 run : " + t1.thread.isAlive() );
            t1.thread.join();
            System.out.println("Thread 2 run : " + t2.thread.isAlive() );
            t2.thread.join();
            System.out.println("Thread 3 run : " + t3.thread.isAlive() );
            t3.thread.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("Main thread stop!");
        }

        System.out.println("Thread 1 run : " + t1.thread.isAlive() );
        System.out.println("Thread 2 run : " + t2.thread.isAlive() );
        System.out.println("Thread 3 run : " + t3.thread.isAlive() );
    }
}

