package exeservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(8);
        Counter counter = new Counter();
        long start = System.nanoTime();

        List<Future<Double>> futures = new ArrayList<>();
        for (int i = 0; i < 400 ; i++) {
            final int j = i;
            futures.add(
                    CompletableFuture.supplyAsync(
                            () -> counter.count(j), threadPool
                    )
            );
        }

        double value = 0;
        for (Future<Double> future : futures ) {
            value += future.get();
        }

        System.out.println(String.format("Exe by %d s, value: %f",
                (System.nanoTime() - start)/(1000000000), value));

        threadPool.shutdown();

    }
}
