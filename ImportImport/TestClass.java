
// add any necessary import statements here

class TestClass {
  public static void main(String[] args) {   // error: 'main' method is not declared 'public static'
    // add test code here
    System.out.println("Hello World");
    ClassTest.main();
    // add any print statements here
  }
}

// COMPILE
// $ javac -d classes TestClass.java ClassTest.java
// RUN
// $ java -cp classes TestClass
