// create a simple "Data Carrier" Class

record Alien(int id, String name){} 
// same as the class we created in the "OringalClass.java" document
// REMEMBER: All values are PRIVATE and FINAL

// ================================ if you want to creae a default constructor
/* 
record Alien(int id, String name){
   
//  public Alien(){
//      this(0,"")
//  } 
    // used to assign default value to original constructor
    // NOT RECOMMENDED TO ASSIGN VALUES, AS THIS IS A FINAL CLASS... JUST CREATE ANOTHER CLASS!!!

    public Alien(int id, String name){
        if(id==0) throw new IllegalArgumentException("id cannot be zero");
        this.id = id;
        this.name = name;
    } // must recopy original constructor if assigning default values as above
} // BEST FOR WHEN YOU WANT AN EXCEPTOIN
*/

public class RecordClass {
    public static void main(String[]args){
        Alien a1 = new Alien(1, "Callie");
        Alien a2 = new Alien(1, "Callie");
        //Alien a3 = new Alien(); // uses default constructor

        System.out.println(a1.equals(a2)) // this will return true
    }
}