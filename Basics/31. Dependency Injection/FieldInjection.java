public class ClassA(){
    public ClassB classB;

    public ClassA(){}
}

public class FieldInjection {
    public static void main(String args[]) {
        ClassA classA = new ClassA();
        classA.classB = new ClassB();
    }
} // has SAME PROBLEMS AS SETTER INJECTION
  // PLUS:  it adds complexity due to the mustion or reflection required to assign Class B();