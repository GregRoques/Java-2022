public Class A{
    private Class B classB;

    public ClassA(){}

    public void setClassB(ClassB classb){
        this.classB= classB;
    } // here, we us the setter to set the dependency
    // NOT RECOMMENDED B/C IT HIDES THE DEPENDENCY:
  
}

public class SetterInjection {
    public static void main(String args[]) {
       Class A classA = new ClassA();
       classA.setClassB(new ClassB());
         //  - by reading the constructor signature we cannot identify that there is a dependency right away,
         //    leading to NullPointerException at runtime
    }
}