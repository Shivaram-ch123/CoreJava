/*
1.Constroctor : used to setup the object (toy)
public → anywhere

private → same class only
protected → same package + child class
default → same package only

i. How Many Ways You Can Write Object Creation?
Way 1: Normal child object
Dog d = new Dog();
d.sound(); // calls Dog's method

Way 2: Parent reference → Child object (Upcasting)
Animal a = new Dog();
a.sound(); // calls Dog's method if overridden

Way 3: Parent reference → Parent object
Animal a = new Animal();
a.sound(); // calls Animal's method
_______________________________________________
2.Static Keyword in Java :

Static means share or common
Something static belongs to the class, not the object

Static = belongs to class
Static variable = shared by all objects
Static method = call without object
Static block = runs once when class loads
Static inner class = inner class can be static
_______________________________________________
3. Java Inheritance (Simple Explanation)
Inheritance = “getting properties from another class”

i.Types of Classes in Inheritance

Parent Class (Super Class) → gives properties
Child Class (Sub Class) → gets properties

✅ Child can use parent methods + own methods

ii. Types of Inheritance (Very Simple)

Single → one parent, one child
Multilevel → grandparent → parent → child
Hierarchical → one parent, many children
Java does not support multiple inheritance with classes (but can do with interfaces)


iii. Rule / How Initialization Works

When you create child object, Java first calls grandparent constructor, then parent, then child
If a parent constructor has super(), it explicitly calls the grandparent
______________________________________________
4. Aggregation in Java (Simple Explanation)                                                              --->declaring and having another class obj , independent

i.Aggregation = “has-a relationship” between classes
One class contains another class as its part
But both classes can exist independently

✅ Example:
A Library has Books
Library can exist without Books
Books can exist without Library
-------------------------------------------------------
5.Composition in simple terms                                                                            ---> purely dependent

✅ Composition has a single dependency:
Only the part depends on the whole

for example if the 1st object is created inside the 2nd class in these kinds of senarioes
------------------------------------------------------
6.What is Association?                                                                                  ----> using like a parameter and independent
Association = “uses-a” relationship

Association = general relationship between two classes
One class uses another class, but no ownership
Both classes can exist independently

✅ Think of it like:
Teacher teaches Student
Teacher can exist without Student
Student can exist without Teacher

__________________________________________
7.Super keyword
1.super = a keyword used to access the parent class

Helps child class use parent’s variables, methods, or constructor

✅ Think of it like:
Parent = Dad
Child = Son

Son says “Dad’s thing, I want to use it” → super

_________________________________________

0.1) Reference :

Car c = new Car();
c → reference (name/address of the object)

new Car() → actual object
--------------------------------------------------
1.Polymorphism in Java (Simple Explanation)
Compile time
Run time
--------------------------------------------------

2. Static Binding (Compile-Time Binding)
--> combining method to method call
Happens at compile-time, compiler already knows which method to call

| Method Type    | Static Binding Reason                           |
| -------------- | ----------------------------------------------- |
| **Static**     | Belongs to class, compiler knows method         |
| **Private**    | Cannot be overridden → compiler knows           |
| **Final**      | Cannot be overridden → compiler knows           |
| **Overloaded** | Different parameters → compiler knows which one |
------------------------------------------------
3.Dynamic Binding :
Java decides which version of a method to execute depending on the actual object, not the reference type. ex: Animal a=new Dog()

Method that can be overriden :instance methods ( normal methods)
_____________________________________________

4. Abstract Class in Java
A class that cannot create objects directly

It can have:
Abstract methods → methods without a body
Normal methods → methods with a body
Purpose: to provide a base for other classes to extend

Rules:

Cannot create object of abstract class
Must be extended by child class
Child class must implement all abstract methods
Can have constructors, variables, and normal methods
_______________________________________________
5.this Keyword in Java
Used for:

Referring to current object variables
Calling current object methods
Calling another constructor (constructor chaining)
Passing current object as argument
______________________________________________
6. Interface in Java
Think of an interface like a rule book.
It tells a class what it should do, but it doesn’t say how to do it.
For example, if your interface says “You must be able to draw”, any class that follows this rule must have a way to draw.

Relation btwn class and interface :
class    -> extend keyword -> to extend class
Interface -> extend keyword -> to extend Interface
class -> implements keyword -> to implement Interface

When to use class vs When to use interface :
🧱 Use a Class When

You are creating a real thing
👉 like Bike, Car, Student, Dog
It has data (things it has)
👉 speed, gear, name, age
It has work to do (things it does)
👉 run, stop, change gear
You want to make objects that remember values
👉 Class = Real object + data + work

📜 Use an Interface When

You are writing rules that many classes must follow
You only say WHAT to do, not HOW to do
Different classes can follow the same rules
One class can follow many interfaces
👉 Interface = Rule book / promise


-> What can be there in Interface :

Can be public → accessible everywhere
Can be default → accessible only in the same package
❌ Cannot be private or protected (if it’s a top-level interface)

Methods in Interface
Before Java 8 → all methods were abstract, i.e., no body
Since Java 8 → methods can be:
default
static
private

Since Java 9 → methods can be private inside the interface
All methods in interface are public by default (even if you don’t write it)

Variables in Interface
All variables are automatically:
public
static
final
____________________________________________________
7.Java Encapsulation
👉 Encapsulation means hiding data and allowing access only through methods.
In simple words:
Data is kept private
We use methods to read or change it safely
->Getter
Used to get / read the value
->Setter
Used to set / change the value
______________________________________________
8.Access Modifiers :
👉 Access modifiers control who can use your class, variables, and methods.

ypes of Access Modifiers in Java

Java has 4 access modifiers:
public
protected
default (no keyword)
private

-> these access specifiers will works for :
Classes
Variables
Methods
Constructors
They are also used for:
Inner (nested) classes
Interfaces (with rules)
________________________________________
9.final keyword= cannot be changed / permanent.


_________________________________________
Java Collections :

10. Vector - same as ArrayList
11. LinkedHashMap -Maintains the order of insertion.
12.TreeSet in Java (Simple Explanation)
Like a Set, it stores only unique elements (no duplicates allowed).
Extra feature: it automatically sorts the elements in ascending order.
13.Hashtable : same as hashmap , but donot contains null

Methods and their behaviour :
| Method Type               | Can be Overridden?              | Can be Called without Object? | Can be Overloaded?    | Access/Visibility Notes         |
| ------------------------- | ------------------------------- | ----------------------------- | --------------------- | ------------------------------- |
| **Public**                | ✅ Yes                           | ❌ Only if static              | ✅ Yes                 | Visible everywhere              |
| **Private**               | ❌ No                            | ❌ Only if static              | ✅ Yes                 | Visible only in class           |
| **Protected**             | ✅ Yes                           | ❌ Only if static              | ✅ Yes                 | Same package + child classes    |
| **Static**                | ❌ No (hidden not overridden)    | ✅ Yes, via class name         | ✅ Yes                 | Belongs to class                |
| **Non-Static / Instance** | ✅ Yes                           | ❌ Must use object             | ✅ Yes                 | Belongs to object               |
| **Final**                 | ❌ No                            | ❌ Only if static              | ❌ No                  | Cannot be changed or overridden |
| **Overloaded**            | Depends (overridden separately)  | ❌ Depends if static           | ✅ Yes (by definition) | Same class, multiple forms      |


| Class Type | Can be Extended? | Can Create Object? | Can Have Methods?         | Notes                                      |
| ---------- | ---------------- | ------------------ | ------------------------- | ------------------------------------------ |
| Regular    | ✅ Yes            | ✅ Yes              | ✅ Yes                     | Normal class                               |
| Abstract   | ✅ Yes            | ❌ No               | ✅ Yes                     | Must extend and implement abstract methods |
| Final      | ❌ No             | ✅ Yes              | ✅ Yes                     | Prevents inheritance                       |
| Interface  | ✅ (implements)   | ❌ No               | ✅ Abstract/default/static | Multiple inheritance allowed               |

Access specifiers :
| Modifier  | Same Class | Same Package | Subclass | Outside Package |
| --------- | ---------- | ------------ | -------- | --------------- |
| public    | ✔          | ✔            | ✔        | ✔               |
| protected | ✔          | ✔            | ✔        | ❌               |
| default   | ✔          | ✔            | ❌        | ❌               |
| private   | ✔          | ❌            | ❌        | ❌               |


1.Multithreading
i.Introduction
Multithreading = Doing many things at the same time in a program.
->A thread is like a helper who can do a job.
Multithreading is having many helpers (threads) working at the same time.
This helps the program finish tasks faster and not get stuck waiting.

ii.Features of Multithreading
->Thread = Smallest Worker:
->Shared Memory, Independent Work:

iii.How to Make Threads in Java:
You can make threads using:
Thread class
Runnable interface
These are just ways to tell Java: “Hey, make a worker and let it do this task!”

iv.Synchronization (Sharing Carefully):
If threads share things, like ingredients in a kitchen, they need to coordinate to avoid mistakes.
In Java, this is called synchronization.
 */