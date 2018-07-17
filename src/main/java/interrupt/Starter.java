package interrupt;

/**
 * Created by korotkov_a_a on 06.07.2018.
 */
public class Starter {
    public static void main(String[] args) {
        Engine engine = new Engine(10);
        engine.thread.start();
    }

}
