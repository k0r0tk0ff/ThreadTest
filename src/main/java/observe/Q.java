package observe;

/**
 * Main class for query
 */

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        int result = 0;

        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        result = n;

        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    synchronized void put(int n) {
        if(n==10) System.exit(0);
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();



        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

