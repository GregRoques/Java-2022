class Counter {
    int count; // defaults to 0;

    public void synchronized increment() {
        // with synchronized, t2 will need to wait for t1 before calling method
        // prevents multiple methods from calling at the same time
        count++;
    }
}

public class Sync {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        c.increment();
        System.out.println("Count = " + c.count) // Count = 2

        Counter c2 = new Counter();

        Thread t1 = new Thread(()->{
            for(int i = 1; i < 1000;i++){
                c2.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 1; i < 1000;i++){
                c2.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join(); // asks main thread to wait;
        t2.join();
        System.out.println("Count = " + c2.count); // won't be 2000 without adding "synchronized" to class; 
        // otherwise, these two run at the same time and as it assigns for each, they overwrite each other
    }
}
