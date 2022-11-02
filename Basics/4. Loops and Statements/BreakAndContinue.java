public class BreakAndContinue {
    public static void main(String[] args) {

    for (int i =1; i<10; i++){
        
        if(i==7){
            continue; // "skips" the rest of this loop's iteration... called a jumping statement.
        }

        if(i>8){
            break; // this 'breaks', or ends, the loop
        }

        System.out.println("value is " + i);
    }
}
