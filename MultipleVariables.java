public class MultipleVariables {
    String s1, s2;
    String s3 = "yes", s4 = "no";
    int i1, i2, i3 = 0;
    boolean flag;
    char charactere;
    double numberDouble;
    float numberFloat;

    public static void main(String[] args) {
        MultipleVariables variables = new MultipleVariables();
        System.out.println(variables.s1);
        System.out.println(variables.s3);
        System.out.println(variables.i2);
        System.out.println(variables.i3);
        System.out.println(variables.flag);
        System.out.println(variables.charactere);
        System.out.println((int) variables.charactere);
        System.out.println(variables.numberDouble);
        System.out.println(variables.numberFloat);

        var testeVar = 10;
        System.out.println(testeVar);
    }
}
