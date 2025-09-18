# Javatraining
Data Types & Variables
    *   Write the java code to swap two numbers without using third variable;
      (Take the input from console)a=20 b=30 After Swapping 30 20
        a= a+b;
        b = a-b;
        a = a-b;
    * Write the java code to swap two numbers  using third variable;
       (Take input from java method arugment ) Interger.parseInt();
Control Statments--> If Else Switch For While 
    * Take input from console and find the largest number.(1,20,3)
    * Take 10input from console and sum them all(Array and use for Loop to get sum).int[] arr=new int[10];
    

Arrays:
    * Write a program to find the maximum and minimum elements in an array.
    
Strings
    * Write a code to check whether string is a palindrome or not(nayan)
    * Count the number of vowels and consonants in a string.

OOP Concepts
    * Create a class student with fields: roll number ,name and marks
        Write a method to display the details of the student.
        // Initialize the student with different arugments 
    * Write a code for to calculate 2,3 and 4 number using method add.(Method overloading add)

add(1,2)
add(1,2,3)
add(1,2,3,4)


// Interface and Abstract class difference
// Marker Interface (example), Functional Interface(example)
// Comparator and comparable interface

Exception --> 
                            
                            Throwable
            Exception                   Error
            RuntimeException

Collectin Framework--> A unified architecture for storing and manipulating groups of object .

Provides Interfaces, implementation(classes).
1,5,7,9  --> 1,5, 6,7,9
a[0] a[1] a[2] a[3]  -> a[0] a[1]  a[2] a[3] a[4]
Array--> Sequential memory location int[] a = new int[10] (Searching is main Operation ) a[0] a[1]  a(1000)   a+9*4=1000+36=1036
LinkedList--> Nodes(Inseration and Deletion )
1--> 5--> 7-->9 --> 1--> 5-->6--> 7-->9
Queue--> First in first out
Stack--> Last in first out
Set--> Non duplicate elements

Collection framework in java is a set of interfaces and classes that helps us in storing and manipulating group of objects(like lists,sets ,queues,map).


                                       Iterable(interface)(java.util)
                                      Collection(interface)
                    List(interface)      Set(interface)         Queue
                    ArrayList(Class)       HashSet(Class)       PriorityQueue 
                    LinkedList(Class)      LinkedHashSet        ArryaDeque
                    Vector                  TreeSet
                    Stack

List Interface:
* Belongs to java.util.
* It is child interface of Collection.
* It represents an ordered collection(also called a sequence).
* Duplicates are allowed.
* Elements in list are indexed, you can access them via position.


Main implementing classes:
1. ArrayList- Dynamic array, best for searching.
2. LinkedList- doubly linked list, best for insert/delete.
3. Vector is a legacy class, synchronized.
4. Stack extends Vector(LIFO data structure).

Interface--> Before java 8 (interface can contains only abstract method)
All the variables inside interface is by default public static and final
After Java 8 :
default method and static method added to interface
to overcome the  issue of compilation and no need to override the newly added method


// Stream API --> they don't hold the data they use to performe operation on data 


Set--> collection of unique object
[1,1,1,1,2,3]--> [1,2,3]

[1,2,3,1,2,3,1,2,2]
* Contains unique Elements
* Elements in set are not indexed, you can't access them via position.
* Some implementation maintain order , other's don't


Equals and Hashcode method:

