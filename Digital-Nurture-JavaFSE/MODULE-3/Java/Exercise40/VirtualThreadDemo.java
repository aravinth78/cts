import java.util.ArrayList;
import java.util.List;

public class LightweightThreads {
    public static void main(String[] args) throws InterruptedException {
        int count = 50_000;
        List<Thread> threads = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Thread vt = Thread.startVirtualThread(() ->
                    System.out.println("Running virtual thread"));
            threads.add(vt);
        }

        for (Thread t : threads)
            t.join();

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Launched " + count + " virtual threads");
        System.out.println("Time: " + elapsed + " ms");
    }
}
