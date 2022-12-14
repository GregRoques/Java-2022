// Thread Safety: Thread-safe code manipulates shared data structures while preventing unintended interaction.

// EX: below, we don't want both threads to be working with "count" at the same time

// solution using synchronized
// ========================================================================
class Counter {
    int count;

    public synchronized void increment() {
        // one way to do this is by adding synchronized above
        // this makes it assessible by only one thread: t2 will wait for t2
        count++;
    }
}

public class ThreadSafety {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        })

        Thread t2 = new Thread(new Runnable() {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        })

        t1.start();
        t1.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

// solution using AtomicInteger
// ========================================================================
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger Integer count = new AtomicInteger();

    public void increment() {
        // one way to do this is by adding synchronized above
        // this makes it assessible by only one thread: t2 will wait for t2
        count.incrementAndGet();
    }
}

public class ThreadSafety {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        })

        Thread t2 = new Thread(new Runnable() {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        })

        t1.start();
        t1.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}