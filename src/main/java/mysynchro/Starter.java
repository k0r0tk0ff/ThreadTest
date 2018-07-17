package mysynchro;

public class Starter {
    public static void main(String[] args) {
        NewCaller newCaller = new NewCaller();

            RunnableImpl i1 = new RunnableImpl(" Wellcome ", newCaller);
            RunnableImpl i2 = new RunnableImpl(" to ", newCaller);
            RunnableImpl i3 = new RunnableImpl(" synchronized world ", newCaller);
        try {
            i1.thread.start();
            i1.thread.join();

            i2.thread.start();
            i2.thread.join();

            i3.thread.start();
            i3.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
