package call;


import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Engine {

    int valueForTest;

    public void setValueForTest(int valueForTest) {
        this.valueForTest = valueForTest;
    }

    Callable task = () -> {
        try {
            TimeUnit.SECONDS.sleep(3);
            return valueForTest;
        } catch (InterruptedException e) {
            throw new IllegalStateException("task interrupt!", e);
        }
    };
}
