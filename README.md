
---

# Java Map Interface Example — HashMap Usage

## Description

This project demonstrates the use of the **Map** interface in Java, specifically using a `HashMap`. It covers basic operations such as inserting key-value pairs, retrieving values, checking keys, removing entries, and iterating over the map.

## Features

* Creates a `HashMap` with integer keys and string values.
* Adds entries to the map.
* Retrieves values using keys.
* Checks if certain keys exist.
* Prints all keys and values separately.
* Removes a key-value pair.
* Iterates over the map entries using a for-each loop.

## Code Structure

* `Mapping` class: Contains the `main` method demonstrating basic `Map` operations.

## How to Run

1. Compile the class:

   ```bash
   javac Concepts/MapInterface/Mapping.java
   ```

2. Run the program:

   ```bash
   java Concepts.MapInterface.Mapping
   ```

## Sample Output

```
Size of map interface is: 4
A
true
false
[1, 2, 3, 4]
[A, B, C, D]
B
Size of map interface is: 3
Key: 1, Value: A
Key: 3, Value: C
Key: 4, Value: D
```

## Explanation

* Initially, four entries are added to the map.
* `map.size()` returns the number of key-value pairs.
* `map.get(1)` returns value "A".
* `map.containsKey(3)` returns `true` while `map.containsKey(7)` returns `false`.
* `map.keySet()` and `map.values()` print all keys and values.
* Removing key `2` removes the entry with value "B".
* Final iteration prints all remaining key-value pairs.

## Requirements

* Java JDK 8 or above
* Understanding of Java Collections Framework and Map interface basics

