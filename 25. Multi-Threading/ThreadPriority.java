
public class ThreadPriority {
    public void static main(String[] args) throws Exception{

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Hi" + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500); 
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        };);
                                    
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500); 
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        };);

        System.out.println(t1.getName()) // Thread-0
        System.out.println(t1.getName()) // Thread-1

        t1.setName("Hi Thread");
        t2.setName("Hellow Thread");

        // can also do...

        Thread t3 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("What's up?");
                try {
                    Thread.sleep(500); 
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }, "What's up Thread"); // put name here

        //======================================== Priority
        // is on a scale of 1 - 10; 1 is lowest, 10 is highest, 5 is "normal"

        System.out.println(t1.getPriority()); // defaults to 5 in this instance
        System.out.println(t2.getPriority()); // 5 is normal, or NORM_PRIORITY

        t1.setPriority(1); // can also do: t1.setPriority(Thread.MIN_PRIORITY) ... notice Enum
        t2.setPriority(10); // can also do: t2.setPriority(Thread.Max_PRIORITY)


        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){
            System.out.println("Main Start Error: " + e);
        } 
        t2.start();

        t1.join(); 
        t2.join();

        System.out.println("Bye");
    }
}
