# Sealed Class (or Interface)

- Sealing allows classes and interfaces to define their permitted subtypes.

**Sealed Inferface:** To seal an interface, we can apply the sealed modifier to its declaration. The permits clause then specifies the classes that are permitted to implement the sealed interface.

**EX:**

```
public sealed interface Service permits Car, Truck {

    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }

}
```

**Sealed Class:**

- Similar to interfaces, we can seal classes by applying the same sealed modifier. The permits clause should be defined after any extends or implements clauses.

```
public abstract sealed class Vehicle permits Car, Truck {

    protected final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

}
```

- A permitted subclass must define a modifier. It may be declared final to prevent any further extensions.

```
public final class Truck extends Vehicle implements Service {

    private final int loadCapacity;

    public Truck(int loadCapacity, String registrationNumber) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }
```

- A permitted subclass may also be declared sealed. However, if we declare it non-sealed, then it is open for extension.

```
public non-sealed class Car extends Vehicle implements Service {

    private final int numberOfSeats;

    public Car(int numberOfSeats, String registrationNumber) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
```

# Abstract and Final Recap

## Abstract

- classes or interfaces that cannot be used to create objects (to access it, it must be inherited from another class).

**Ex:**

```
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## Final

- a class, declared with the final keyword, that cannot be extended or inherited, only instantiated.

**EX:**

```
final class myFinalClass
{
    void myFinalMethod()
    {
        System.out.println("We are in the final class we just created");
    }
}

class MainClass
{
    public static void main(String arg[])
    {
        myFinalClass fc = new myFinalClass();
        fc.myFinalMethod();
    }
}
```
