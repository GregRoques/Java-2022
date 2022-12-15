class Alien{
    private final int id;
    private final String name;

    public Alien(int d, Sring name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return id == alien.id && Objects.equals(name, alien.name);
    } // changing value of equals to see if 2 instantiations of this object are equal

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    } // changing value of equals to see if 2 instantiations of this object's hashcode are equal

    @Override
    public String toString(){
        return "Alien{" + 
        "id=" + id +
        ", name=" + name + "\'" +
        "}";
    }
}

public class OriginalClass {
    public static void main(String[]args){
        Alien a1 = new Alien(1, "Callie");
        Alien a2 = new Alien(1, "Callie");

        System.out.println(a1.equals(a2)) // this will return false w/out override
    }
}