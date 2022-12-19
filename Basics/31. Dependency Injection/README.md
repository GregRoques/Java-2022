# Dependency Injection

- The pattern ensures that an object or function which wants to use a given service should not have to know how to construct those services.

- Instead, the receiving 'client' (object or function) is provided with its dependencies by external code (an 'injector'), which it is not aware of.

- It is a way of achieving _loose coupling._

## 3 Types:

1. **Constructor Injection:** where dependencies are provided through a client's class constructor.

2. **Setter Injection:** where the client exposes a setter method which accepts the dependency.

3. **Field Injection:** used to set value object as dependency to the field of an object.

**_The concept of Dependency Injection is born of the Inversion of Control concept_**

# Inversion of Control

- a principle of software engineering which _transfers the control of objects_ to portions of a program or framework. This enables the framework to take control over the flow of a program and makes calls to our custom code.

- to do this, frameworks use **abstractions** (_the process of hiding certain details and showing only essential information to the user_) to add extra behavior, extending the classes of the framework. This keeps with the 5th principle of _SOLID_ -- Dependency Inversion -- stating that a class should depend on abstractions and no on concretions (Hard Dependencies).

- put another way, a class should concentrate on fulfilling its responsibilites, not on creating objects that are required to fulfill them -- _these objects are provided by Dependency Injection._

**Benefits:**

- This reduces duplicate code, as _dependencies are provided by the injectors._
- classes are more _open to extension_ and _closed for modification_.
- program is _easier to test_, as the _dependencies can be isolated_, allowing components to communicate through contracts.

## Note: Only use when necessary

- sometimes, pulling functions out of a class that are not necessary anywhere else can add complexity to your code, raise the risk of data leakage, and reduce abstraction.
