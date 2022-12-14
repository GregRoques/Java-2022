public class Switch {
    public static void main(String args[]) {

        String day = "Tueday"

        switch(day)
        {
            case "Satuday":
                System.out.println("6:40 AM");
                break;
            case "Tuesday", " Thursday":
                System.out.println("5:30 AM");
                break;
            default:
                System.out.println("6:15 AM");
        }
        
    }
}