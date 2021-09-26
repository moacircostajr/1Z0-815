public class Operators {
  public static void main(String[] args) {
    // add test code here
    int valor1 = 1;
    int valor2 = 2;

    boolean resultado1 = (valor1 == 1) && (valor2 == 2);
    System.out.println("valor1 é 1 e valor2 é 2 - resultado: " + resultado1);

    boolean resultado2 = (valor1 == 1) || (valor2 == 2);
    System.out.println("valor1 é 1 e valor2 é 2 - resultado: " + resultado2);

    boolean verdadeiro = true;
    boolean falso = false;

    System.out.println(verdadeiro & falso);
    System.out.println(falso && verdadeiro); // short circuit. if the first expression is false, the second expression
                                             // will not be checked.
    System.out.println(verdadeiro || falso);
    System.out.println(verdadeiro ^ falso); // The XOR logical operation, or exclusive or, takes two boolean operands
                                            // and returns true if and only if the operands are different.
    System.out.println(!verdadeiro && falso);

    boolean a = false;
    a &= b(); // a = a & b
    System.out.println(a);
    a |= b();
    System.out.println(a);
    a ^= b();
    System.out.println(a);

    // add any print statements here
    System.out.println((char) 81);
    System.out.println((int) 'Q');
    System.out.println((byte) 128); // overflow: byte = from -128 to 127
    System.out.println("Hello World");
  }

  private static boolean b() {
    System.out.println("b() was called");
    return true;
  }
}

/*
 * Operators Precedence postfix expr++ expr-- unary ++expr --expr +expr -expr ~
 * ! multiplicative * / % additive + - shift << >> >>> relational < > <= >=
 * instanceof equality == != bitwise AND & bitwise exclusive OR ^ bitwise
 * inclusive OR | logical AND && logical OR || ternary ? : assignment = += -= *=
 * /= %= &= ^= |= <<= >>= >>>=
 */