# Interface

- An interface is a completely "abstract class" that is used to group related methods with empty bodies.

```
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

## 3 Types of Interfaces

1. Normative - multiple method
2. Functional Interface (formerly Single Abstract Method) - one method ... uses Lambda Expressions (taken from Scala language)
3. Marker Interface - no methods

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

## When Should You Use an Interface?

- If you are creating functionality that will be useful across a wide range of objects, then you must use an interface. Abstract classes, at the end of the day, should be used for objects that are closely related. But the interfaces are best suited for providing common functionality to unrelated cases.
- Interfaces are a great choice if you think that the API won’t be changing for a while.
- Interfaces are also a great choice if you want to have something similar to the multiple inheritances, then you can implement various interfaces.
- If we are going to design the small, concise bits of functionality, then you must use interfaces. But if you are designing the large functional units, then you must use an abstract class.

## When should you use an abstract class?

- An abstract class is a great choice if you are bringing into account the inheritance concept because it provides the common base class implementation to the derived classes.
- An abstract class is also good if you want to declare non-public members. In an interface, all methods must be public.
- If you want to add new methods in the future, then it is great to go with the abstract class. Because if you add new methods to the interface, then all of the classes that are already implemented in the interface will have to be changed in order to implement these new methods.
- If you want to create multiple versions of your component, then go with the abstract class. Abstract classes provide a simple and easy way to version your components. When you go with updating the base class, all of the inheriting classes would be automatically updated with the change. Interfaces, on the other hand, can’t be changed once these are created. If you want a new version of the interface, then you must create a new interface.
- Abstract classes always have the advantage of allowing better forwarding compatibility. Once the clients are onto an interface then you simply can't change it in the end. But if the abstract class is set up, then you can still add the behavior without breaking the existing code.
- An abstract class is used if you want to provide a common, implemented functionality among all the implementations of the component. Abstract classes will allow you to partially implement your class, whereas interfaces would have no implementation for any members whatsoever.
