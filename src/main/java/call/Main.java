package call;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Engine engine = new Engine();
        engine.setValueForTest(4);
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(engine.task);
        System.out.println("Task1 done? - " + future.isDone());
        System.out.println("result1 = " + future.get());
        executorService.shutdown();
    }
}
