public class MultipleCatchBlocks {
    public static void main(String[] args) {
        // try {
        //     int a[] = new int[6];
        //     int a[6] = 8; // not there.
        //     int i =7
        //     int j = 2
        //     int k = i/j;
        // } catch (ArithemeticException e) {
        //     System.out.println("Cannot devide by zero: " + e)
        // } catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println("Keep array within limit: " + e)
        // } catch (Exception e){
            //System.out.println("Error " + e);
        }

    // Words better:
    try

    {
            int a[] = new int[6];
            int a[6] = 8; // not there.
            int i =7
            int j = 2
            int k = i/j;
        }catch(ArithemeticException|ArrayIndexOutOfBoundsException|
    Exception e)
    {
            System.out.println("Error: " + e)
        } // best to end with Exceptino at end to catch all other errors
}}