// runnable is a functional method that only contains run();
class Hi implements Runnable {
    public void run() { // use run instead of show, as Start() in the main thread always calls run.
        for (int i = 1; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500); // setTimeOut for .5 sec
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}

public class RunnableInterface {
    public void static main(String[] args){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1); // now, new thread will call obj1 and can run "run()" as it is inherited from "Runnable" interface
        Thread t2 = new Thread(obj2);

        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){
            System.out.println("Main Start Error: " + e)
        } // prevents millisecond clash (ex: Hi Hello Hi Hello Hello Hi Hello)
        t2.start();
    }
}
