

record Alien(int id, String name) implements Clonable{ // can implement instances

    public Alien(){
        if(id==0) throw new IllegalArgumentException("id cannot be zero");
    } // same as exception in "RecordClass.java" custom constructor, but w/out unnecessary details... works the same

    public void show(){
        System.out.println("I am a custom method")
    } // can add custom methods too!
} 

public class RecordClass {
    public static void main(String[]args){
        Alien a1 = new Alien(1, "Callie");
        Alien a2 = new Alien(0, "Midnight"); // throws error
    }
}