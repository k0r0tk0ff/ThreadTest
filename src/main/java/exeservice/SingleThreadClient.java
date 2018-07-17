package exeservice;

public class SingleThreadClient {
    public static void main(String[] args) {
        Counter counter = new Counter();

        long start = System.nanoTime();
        double value = 0;

        for (int i = 0; i < 400; i++) {
            value += counter.count(i);
        }

        System.out.println(String.format("Exe by %d s, value: %f",
                (System.nanoTime() - start)/(1000000000), value));

    }
}
