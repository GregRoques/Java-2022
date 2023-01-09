# Java 2022

## Basics

[Tutorial](https://www.youtube.com/watch?v=8cm1x4bC610&t=2067s)

## Spring Boot

[Spring Framework](https://www.youtube.com/watch?v=35EQXmHKZYs&list=PLM2GdNHvfSCHsjHjQuXMy2yE_o_pS23eR&index=3)

[Download Spring Boot Tools for Eclipse](https://spring.io/tools)
[Mail Sender w/Spring Boot](https://www.youtube.com/watch?v=ugIUObNHZdo)

[Generate and Download Spring Boot project online](https://start.spring.io)... Spring Boot Tools handles this for you in your IDE of choice

# Class vs. Object

- A **class is a template for an object**. It defines object properties including a valid range of values, and a default value. A class also describes object behavior.
- An **object** is a member or an "instance" of a class. An object has a state in which all of its properties have values that you either explicitly define or that are defined by default settings.

# 4 Basics of OOP

### 1. Encapsulation

The word “encapsulate” means to enclose something. Just like a pill "encapsulates" or contains the medication inside its coating, encapsulation works in a similar way in OOP: by forming a protective barrier around the information contained within a class from the rest of the code.

In OOP, we encapsulate by binding the data and functions that operate on that data into a single unit known as the class. This hides private details of a class from the outside world and only exposes functionality important for interfacing with it. When a class does not allow calling code access to its private data directly, we say that it is well encapsulated.

```
class Student {

    private int rollno;
    private String name;

    public void setRollno(int r) {
        // setter
        this.rollno = r;
    }

    public int getRollno() {
        // getter
        return rollno;
    }

    public void setName(int r) {
        // setter
        this.name = r;
    }

    public String getname() {
        // getter
        return name;
    }
}

```

### 2. Abstraction

An abstract class can be defined as a class declared with the keyword “abstract” and has a restriction that it cannot be instantiated. An abstract class may or may not have any abstract method (a method with no implementation). Think of it as an incomplete class with an incomplete behavior.

Carefully used, abstraction helps isolate the impact of changes made to the code so that if something goes wrong, the change will only affect the implementation details of a class and not the outside code.

```
//abstract class
abstract class Bank{
    abstract int getInterestRate();
}
//concrete class
class Citi extends Bank{
    int getInterestRate(){return 7;}
}
//concrete class
class HSBC extends Bank{
    int getInterestRate(){return 6;}
}

class Main{
    public static void main(String args[]){
        Bank b;
        b = new Citi ();      // concrete class object
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");
        b = new HSBC ();        // concrete class object
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");
    }
}

/*
Output:
- Citi Rate of Interst is: 7%
- HSBC Rate of Interest is: 6%
*/
```

### 3. Inheritance

Object-oriented languages that support classes almost always support the notion of “inheritance.” Classes can be organized into hierarchies where a class might have one or more parent or child classes. If a class has a parent class, we say it is derived or inherited from the parent class and it represents an “IS-A” type relationship. That is to say, the child class “IS-A” type of the parent class.

Therefore, if a class inherits from another class, it automatically obtains much of the same functionality and properties from that class and can be extended to contain separate code and data. A nice feature of inheritance is that it often leads to good code reuse since a parent class’s functions don’t need to be re-defined in any of its child classes.

Consider two classes: one being the superclass—or parent—and the other being the subclass—or child. The child class will inherit the properties of the parent class, possibly modifying or extending its behavior. Programmers applying the technique of inheritance arrange these classes into what is called an “IS-A” type of relationship.

```
class Calc { // Super class
    public int add(int i, int j) {
        return i + j; // HAS-A
    }
}

class CalcAdvanced extends Calc { // Sub Class
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVeryAdvanced extends CalcAdvanced { // multi-level inheritance
    public int multi(int i, int j) {
        return i * j;
    }
}
```

### 4. Polymorphism

In OOP, polymorphism allows for the uniform treatment of classes in a hierarchy. Therefore, calling code only needs to be written to handle objects from the root of the hierarchy, and any object instantiated by any child class in the hierarchy will be handled in the same way.

Because derived objects share the same interface as their parents, the calling code can call any function in that class’ interface. At run-time, the appropriate function will be called depending on the type of object passed leading to possibly different behaviors.

```
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

/*
Output:
- The animal makes a sound
- The pig says: wee wee
- The dog says: bow wow
*/
```

# Data Types

**Primitive data types:** A primitive data type specifies the size and type of variable values, and it has no additional methods.

- byte
- short
- int
- long
- float
- double
- boolean
- char

**Non-primitive data types:** are called reference types because they refer to objects.

- String
- Arrays
- Classes

### The main difference between primitive and non-primitive data types are:

- _Primitive types_ are predefined (already defined) in Java. _Non-primitive_ types are created by the programmer and is not defined by Java (except for String).
- _Non-primitive types_ can be used to call methods to perform certain operations, while _primitive types_ cannot.
- A _primitive type_ has always a value, while _non-primitive_ types can be null.
- A _primitive type_ starts with a lowercase letter, while _non-primitive types_ starts with an uppercase letter.
- The size of a _primitive type_ depends on the data type, while _non-primitive types_ have all the same size.
