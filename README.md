# Assignment 7: Employee Hash Table

## Description

This program modifies the textbook hash table so that it stores complete `Employee` objects instead of strings.

The employee's name is used as the input to the hash function. The hash table uses an array of generic `LinkedList3<Employee>` objects to handle collisions.

## Files

* `Employee.java` - Defines the Employee object.
* `LinkedList3.java` - Generic linked list used by the hash table.
* `EmployeeHashTable.java` - Implements the hash table.
* `EmployeeHashTableApp.java` - Tests the hash table.

## Hash Function

The hash function adds the character values of the employee's name and uses the remainder after dividing by 10.

For example:

```text
hash = sum of character values % 10
```

The table has 10 buckets numbered 0 through 9.

## Collision Testing

The program tests a collision using:

* John Smith
* David Lee

Both names hash to bucket 8.

The two Employee objects are stored in the same linked-list bucket. The `get` method searches that linked list and is able to retrieve the correct employee.

## Testing

The program tests:

* Adding six Employee objects
* Retrieving existing employees
* Retrieving an employee that does not exist
* Two employees that hash to the same bucket
* Displaying the contents of the hash table

When an employee does not exist, the `get` method returns `null`.

## Gemini Use and Reflection

### Prompt 1

I asked Gemini how to modify a string hash table so that it could store Employee objects using a generic LinkedList3 class.

Gemini explained that the hash table should use `LinkedList3<Employee>` and that the employee's name should be passed to the hash function.

### Prompt 2

I asked Gemini how to test collisions in the employee hash table and make sure the get method searches the correct linked-list bucket.

Gemini helped me test employee names that produce the same hash value and explained that both employees should remain in the same linked list.

### Prompt 3
I asked gemini to help with my read me.

### Suggestion I Changed

Gemini suggested using Java's built-in `HashMap` to make the lookup easier. I did not use this suggestion because the assignment specifically requires a custom hash table and `LinkedList3` implementation.

### Verification

I compiled and tested the program and checked that the six employees were added correctly. I retrieved several employees by name and confirmed that the correct Employee objects were returned.

I also tested an employee who was not in the table and confirmed that `get` returned `null`.

Finally, I tested the collision between John Smith and David Lee. Both names hash to bucket 8, and both employees could still be retrieved correctly.

https://www.onlinegdb.com/s/as/390021
