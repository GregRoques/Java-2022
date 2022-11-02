# Enums

- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.

```
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

- You can access **enum** constants with the dot syntax:

```
Level myVar = Level.MEDIUM;
```

**Note that they should be in uppercase letters.**

- **Enum** is short for **_enumerations_**, which means **_specifically listed_**.

## Difference between Enums and Classes

- An enum can, just like a class, have attributes and methods. The only difference is that enum constants are **public**, **static** and **final** (unchangeable - cannot be overridden).

- An enum **_cannot be used to create objects_**, and it **_cannot extend other classes_** (but it can implement interfaces).

## Why And When To Use Enums?

- Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

## Loop Through an Enum

- The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:

```
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

for (Level myVar : Level.values()) {
  System.out.println(myVar);
}

```
