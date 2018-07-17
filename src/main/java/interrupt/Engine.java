package interrupt;

public class Engine implements Runnable {
    public Thread thread;
    private int breackValue;

    public Engine(int breackValue) {
        this.breackValue = breackValue;
        this.thread = new Thread(this, "Engine");
    }

    public void run() {
        for (int i=1; i < 100; i++) {
            System.out.println(i);

            if(i==breackValue) {
                thread.interrupt();
            }

            if(thread.isInterrupted()) {
                System.out.println("suspresume block \"is interrupted\"");
                break;
            }
        }
    }
}
