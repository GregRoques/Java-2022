
public class JoinAndIsAlive {
    public void static main(String[] args) throws Exception{

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Hi");
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

        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){
            System.out.println("Main Start Error: " + e);
        } 
        t2.start();

        // because the two above functions have been deligated to sub-Threads, the main thread will run this while these are running, making it print Asynchronously
        //System.out.println("Bye");

        t1.isAlive();
        t2.isAlive(); // will display as true... because these are running;
    
        t1.join(); // this waits for these two to complete and re-join with the main thread
        t2.join();

        t1.isAlive();
        t2.isAlive(); // will display as false after t1 and t2 have run...because these are no longer running;
        System.out.println("Bye");
    }
}
