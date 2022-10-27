# Collection and Generics

## Collection API

Ex:

```
Collection values = new ArrayList();
values.add(5);

// unlike "int[] c = new int[4]", Collection is not fixed;
```

- in the above, "values" is type "Object Data Type", or a Reference data Type; its type is not pre-defined, and it typically "points" to a reference variable. However, you can do:

```
Collection<Integer> values = new ArrayList<Integer>();
values.add(6)
values.add(7)
```

- the **<>** brackets house the generic types

## Collection API Interfaces:

### List

Collections do not have a defined order. If you want to get an element at a specific index, use _List_.

```
List<Integer> values = new ArrayList<Integer>();
values.add(3) // goes in index spot 0
```

- **List implementation classes are LinkedList and ArrayList.**
- The list implementation allows us to add the same or duplicate elements.
- The insertion order is maintained by the List.
- We can get the element of a specified index from the list using the get() method.
- It is used when we want to frequently access the elements by using the index.

### Set

- The set implementation doesn't allow us to add the same or duplicate elements; it doesn't maintain the insertion order of elements.

```
Set<Integer> numbers = new HashSet<Integer>();

```

- It is used when we want to design a collection of unique elements.
- **The Set implementation classes are TreeSet, HashSet and LinkedHashSet.**
- A **_TreeSet_** is a set where the elements are sorted. A **_HashSet_** is a set where the elements are not sorted or ordered.

**TreeSet Ex:**

```
Set<Integer> numbers = new HashSet<Integer>();
numbers.add(5)
numbers.add(2)
numbers.add(1)
numbers.add(9)

// will return: 1, 2, 5, 9
```

### Map

Map returns a value and a key

```
Map<Integer, String> m = new HashMap<Integer, String>()
```

- A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.

- There are **_two interfaces_** for implementing Map in java: **Map and SortedMap**
- There are **_three classes_** for Map in Java: **HashMap, TreeMap, and LinkedHashMap**.
- The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.
