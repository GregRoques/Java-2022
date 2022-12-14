sealed class A permits B, C {

}
// all classes extending "sealed" class should be "sealed", "non-sealed", or "final"
non-sealed class B extends A{

}

final class C extends A{

}

class D extends B {

}

sealed interface X permits Y{

}

sealed interface Y extends X{
    
}



public class SealedClass {
    public static void main(String args[]) {

    }
}
