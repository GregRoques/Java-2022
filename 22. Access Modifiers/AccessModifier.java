/* lets say you have a class A in a package

public class A {
    protected int i = 10;

    public void method1(){
        method2()
    }

    private void method2(){
        System.out.println(i)
    }
}

*/

//package com.gregroques
//import com.gregroques.A

public class AccessModifier {
    public static void main(String a[]) {
        A obj = new A();
        obj.method1(); // 10
    }
}
