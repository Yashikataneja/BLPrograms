# BLPrograms

ARRAY : this is a linear data structure which holds the homogeneous data (same type of data), we can access its elements through indices..

It is access through arr[8] or arr[0] (through indices only).

Array is of 3 types:

best way to access values from arrays is loop, bcz when we have to perform repeated tasks, we use loops.

length method will always count and starts from 1 not 0., but index always starts with 0.

for each loop will use when we have to print the indexes and value .. In java we will write only for, not each!! but in other languages, we will write for and each separately,

SYNTAX :  

FOR(INT NUM:MARKS){
    SOUT(NUM);
}

FOR EACH LOOP WILL PRINT ONLY VALUES... NOT FULL ARRAY!

2. 2D : arr[i][j] : rows and cols
3. two loops : inner and outer ; outer[i] rows will modify the rows and inner[j] cols will perform the inner operations..

1D Array : it is also known as vector array in some languages..
Multi Dimensional Array

For primitive arrays, elements are stored in a contiguous memory location, For non-primitive arrays, references are stored at contiguous locations, but the actual objects may be at different locations in memory.

 Create an Array
To create an array, you need to allocate memory for it using the new keyword:
// Creating an array of 5 integers
int[] numbers = new int[5]; 

Array Properties
In Java, all arrays are dynamically allocated.
Arrays may be stored in contiguous memory [consecutive memory locations].
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using size of.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning with 0.
Java array can also be used as a static field, a local variable, or a method parameter.
An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class, depending on the definition of the array. In the case of primitive data types, the actual values might be stored in contiguous memory locations (JVM does not guarantee this behavior). In the case of class objects, the actual objects are stored in a heap segment.

Declare
Initialize
Access

The general form of array declaration is 
Method 1:
type var-name[]; 
Method 2:
type[] var-name;

 First, you must declare a variable of the desired array type. Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.

 Array Literal in Java : 
In a situation where the size of the array and variables of the array are already known, array literals can be used. 
// Declaring array literal  
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
The length of this array determines the length of the created array.
There is no need to write the new int[] part in the latest versions of Java.

In Java, you can initialize arrays in several ways. Here are the main ways:

1) static Initialization (Declaration + Initialization in one line)
int[] arr = {1, 2, 3, 4, 5};
Java automatically figures out the size based on the number of elements.
2) dynamic initialization using new :
int[] arr = new int[5];  // size 5, all elements default to 0
arr[0] = 10;
arr[1] = 20;
3. Using new with values : 
int[] arr = new int[]{1, 2, 3, 4, 5};
Useful when array is declared separately from initialization.
4) Anonymous Array : 
printArray(new int[]{1, 2, 3, 4}); 
void printArray(int[] arr) {
    for (int i : arr) System.out.println(i);
}



