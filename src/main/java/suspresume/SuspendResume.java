package suspresume;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("first thread");
        NewThread ob2 = new NewThread("second thread");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Thread one suspend");
            Thread.sleep(1000);
            ob1.myResume();
                Thread.State state = ob1.t.getState();
                System.out.println("ob1 thread state = " + state);
            System.out.println("Thread one resume its suspresume");
            ob2.mySuspend();
            System.out.println("Thread two suspend");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Thread two resume its suspresume");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Main thread end");

    }
}
