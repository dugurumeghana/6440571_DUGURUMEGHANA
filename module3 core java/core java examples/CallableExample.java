import java.util.concurrent.*;
class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task1 = () -> "Task 1 complete";
        Callable<String> task2 = () -> "Task 2 complete";
        Callable<String> task3 = () -> "Task 3 complete";

        Future<String> future1 = executor.submit(task1);
        Future<String> future2 = executor.submit(task2);
        Future<String> future3 = executor.submit(task3);

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());

        executor.shutdown();
    }
}
