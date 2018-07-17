package suspresume;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread(String threadName) {
        this.name = threadName;
        this.t = new Thread(this, name);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i=10; i>0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }

        System.out.println(name + " завершен");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized  void myResume() {
        suspendFlag = false;
        notify();
    }
}
