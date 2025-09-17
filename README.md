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