
public class Lambda {
    public void static main(String[] args){

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
    
    }
}
