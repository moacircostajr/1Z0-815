import java.util.Random; // read from left to right (Random is the class)
// import java.util.*; // import all classes in the package (wildcard)

public class ImportsAndPackagesI {
  public static void main(String args[]) {
    Random r = new Random();
    System.out.println(r.nextInt(10)); // print a number 0-9
  }
}
