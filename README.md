# Head First Java, Chapter 10 Notes (Chapter 9 notes are in Graded-students-lab)
## Chapter 10
- Math methods are as close as you'll ever get to a <em>global</em> method. 
Methods in the Math class don't use any instance variable values. 
A Math object cannot be created.(Page 274)
- Making a class's constructor private allows for a class to not be instantiated. (Page 276)
- "Static methods can't use non-static (instance) variables!" (Page 277)
- Static variable is the same for all instances of the class. (Page 279)
- Static variables in a class are initialized before any object of that class can be created. (Page 281)
- "A final class means you can't extend the class (i.e. you can't make a subclass)." (Page 283)
- If the class is declared as "final," there's no need to mark its methods as "final." 
Consider this: when a class is marked as "final," it cannot be subclassed, 
which means that none of its methods can ever be overridden. (Page 284)
- Sometimes, you may want to treat a primitive as if it were an object. For example, in all versions of Java prior to version 5.0, 
you couldn't directly place a primitive into a collection such as an array, list, or hash map. (Page 287)
- The autoboxing feature introduced in Java 5.0 automatically handles the 
conversion from a primitive type to its corresponding wrapper object. (Page 289)