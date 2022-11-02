class Hi extends Thread {
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

class Hello extends Thread {
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

public class MultiThreading1 {

    // main thread
    public void static main(String[] args){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        // this is asynchrounous... the second will wait for the first to complete thoroughly before calling 2nd
        // obj1.show();
        // obj2.show();

        // unless... you start a thread

        obj1.start();
        try{
            Thread.sleep(10)
        }catch(Exception e){
            "Main Start Error: " + e
        } // prevents millisecond clash (ex: Hi Hello Hi Hello Hello Hi Hello)
        obj2.start();
    }
}
