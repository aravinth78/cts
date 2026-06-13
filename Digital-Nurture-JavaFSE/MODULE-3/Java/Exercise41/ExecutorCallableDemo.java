import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelTasks {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            int id = i;
            Callable<String> task = () -> {
                Thread.sleep(100);
                return "Task " + id + " done";
            };
            futures.add(pool.submit(task));
        }

        System.out.println("Results:");
        for (Future<String> f : futures) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        pool.shutdown();
    }
}
