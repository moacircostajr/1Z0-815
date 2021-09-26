public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.5;
        int valor = (int)salario;   // casting
        System.out.println(valor);

        long numeroGrande = 999999999999999999L;
        short valorPequeno = 2131;
        byte valorMenorAinda = 127;

        double valor1 = 0.1;
        double valor2 = 0.2;
        double total = valor1 + valor2;
        System.out.println(total);

        float valor3 = 0.1f;
        float valor4 = 0.2f;
        float total2 = valor3 + valor4;
        System.out.println(total2);

    }
}
