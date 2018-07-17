package observe;

/**
 * Starter for observe package
 */

public class PCFixwd {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("For stop press \"CTRL + C\"");
    }
}
