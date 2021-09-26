import java.nio.file.Files;
import com.google.gson.*; // import external library inside libs folder
import packagea.InputImports;

public class ImportsAndPackagesII {
  public static void main(String args[]) {
    Files files = null;
    InputImports inputImports = new InputImports();
    inputImports.read(files);
    Gson gson = new Gson();
    System.out.println(gson);
  }
}

// !!! IMPORTANT !!!

// COMPILE AND RUN WITH EXTERNAL LIBRARY AND IMPORT AN OTHER CLASS FROM PROJECT
// $ export
// CLASSPATH="/home/moacir/Development/CODE_LAB/java/1Z0-815/ImportsAndPackagesII/libs/gson-2.8.6.jar"
// $ javac -d classes -classpath $CLASSPATH packages/packagea/InputImports.java
// ImportsAndPackagesII.java
// $ java --class-path "classes:libs/*" ImportsAndPackagesII

// CREATE A JAR WITH EXTERNAL LIBRARY AND IMPORT AN OTHER CLASS FROM PROJECT
// $ cd classes
// $ jar --create --verbose --manifest META-INF/MANIFEST.MF --file
// ImportsAndPackagesII.jar . (JUST INCLUDE FILES FROM FOLDER)
// $ java -jar ImportsAndPackagesII.jar

/*
 * class InputImports { public void read(Files files) { Paths.get("name");
 * System.out.println("importou"); } }
 */

// COMPILE AND RUN
// $ javac packagea/InputImports.java ImportsAndPackagesII.java
// $ java ImportsAndPackagesII

// $ javac -d classes packagea/InputImports.java ImportsAndPackagesII.java
// $ java -cp classes ImportsAndPackagesII OU
// $ java -classpath classes ImportsAndPackagesII OU
// $ java --class-path classes ImportsAndPackagesII

// $ javac -d classes packages/packagea/InputImports.java
// ImportsAndPackagesII.java
// $ java -cp classes ImportsAndPackagesII

// $ java --class-path "classes:libs/gson-2.8.6.jar" ImportsAndPackagesII (DON'T
// COMPILE JAR, JUST RUN)
// $ java --class-path "classes:libs/*" ImportsAndPackagesII
