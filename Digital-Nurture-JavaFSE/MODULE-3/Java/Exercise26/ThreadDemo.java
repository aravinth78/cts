public class ConcurrentTasks {
    public static void main(String[] args) {
        Runnable taskA = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Task A running...");
                try { Thread.sleep(30); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        };

        Runnable taskB = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Task B running...");
                try { Thread.sleep(30); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        };

        Thread t1 = new Thread(taskA);
        Thread t2 = new Thread(taskB);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
