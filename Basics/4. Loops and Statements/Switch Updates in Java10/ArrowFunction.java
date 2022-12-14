public class ArrowFunction {

    public static void main(String args[]){
        String day = "Tueday"
        
        switch(day)
        {
            case "Satuday" -> System.out.println("6:40 AM")
            case "Tuesday", " Thursday" -> System.out.println("5:30 AM");
            default -> System.out.println("6:15 AM");
        }
        // note: can't mix arrows and colons, so pick one;
        // don't need break with arrow
    }
}
