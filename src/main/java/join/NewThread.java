package join;

/**
 * Created by korotkov_a_a on 06.07.2018.
 */
public class NewThread implements Runnable {
    String name;
    Thread thread;

    public NewThread(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New thread" + thread);
        thread.start();
    }

    public void run() {
        try {
            for(int i=5; i>0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен");
    }
}

