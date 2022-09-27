# Interface

- An interface is a completely "abstract class" that is used to group related methods with empty bodies.

```
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

## Notes on Interfaces:

- Like abstract classes, interfaces cannot be used to create objects (like other abstract classes)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are **_by default ABSTRACT AND PUBLIC_**
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

## Why and When to Use

1. To achieve security - hide certain details and only show the important details of an object (interface).

2. Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the **_class can implement multiple interfaces_**. Note: To implement multiple interfaces, separate them with a comma (see example below).

3. Always best to use Interface when you don't want to define methods... otherwise, use abstract class (where you can define method)

## Multiple Interfaces

- Seperate with a comma

```
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```
