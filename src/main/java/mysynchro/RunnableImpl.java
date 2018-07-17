package mysynchro;

public class RunnableImpl implements Runnable{

    String msg;
    Thread thread;
    NewCaller newCaller;

    public RunnableImpl(String msg, NewCaller newCaller) {
        this.msg = msg;
        this.newCaller = newCaller;
        thread = new Thread(this);
        //thread.start();
    }

    public void run() {
        newCaller.call(msg);
    }
}
