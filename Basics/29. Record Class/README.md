# Record Class

A **record class** declares a sequence of fields, and then the appropriate accessors, constructors, equals, hashCode, and toString methods are created automatically.

- The fields are final because the class is intended to serve as a simple **_"data carrier"_**.

- **_For Example:_** here is a record class with two fields:

```
record Rectangle(double length, double width) { }
```

- This concise declaration of a rectangle is equivalent to the following normal class:

```
public final class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() { return this.length; }
    double width()  { return this.width; }

    // Implementation of equals() and hashCode(), which specify
    // that two record objects are equal if they
    // are of the same type and contain equal field values.
    public boolean equals...
    public int hashCode...

    // An implementation of toString() that returns a string
    // representation of all the record class's fields,
    // including their names.
    public String toString() {...}
}
```

**A record class declares the following members automatically:**

- For each component in the header, the following two members:
  - A private final field.
  - A public accessor method with the same name and type of the component; in the Rectangle record class example, these methods are Rectangle::length() and Rectangle::width().
- A **_canonical constructor:_**, meaning it takes the components of your record as arguments and copies their values to the fields of the record class. This constructor assigns each argument from the new expression that instantiates the record class to the corresponding private field.
- Implementations of the equals and hashCode methods, which specify that two record classes are equal if they are of the same type and contain equal component values.
- An implementation of the toString method that includes the string representation of all the record class's components, with their names.
