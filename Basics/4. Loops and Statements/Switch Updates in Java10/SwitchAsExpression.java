public class SwitchAsExpression {
    public static void main(String args[]){
        String day = "Tueday"
        String result = "";
        /*
        switch(day)
        {
            case "Satuday" -> result = "6:40 AM";
            case "Tuesday", " Thursday" -> result = "5:30 AM";
            default -> result = "6:15 AM";
        }
        */

        // ============================================ can also do...

        result = switch(day)
        {
            case "Satuday" -> "6:40 AM";
            case "Tuesday", " Thursday" -> "5:30 AM";
            default -> "6:15 AM";
        }; 
        // no need to include "return" before return value
        // can also use ":", but must commit to : or -> and include "yeild" after colon
        // EX: case "Tuesday", "Thursday": yeild "5:30 AM"


        System.out.println(result)
    }
}
