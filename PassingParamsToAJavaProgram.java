// launching single-file source-code programs
// $ java PassingParamsToAJavaProgram.java teste1 teste2 teste3

public class PassingParamsToAJavaProgram {
  public static void main(String... options) {
    for (String arg : options) {
      System.out.println(arg);
    }
  }
}
