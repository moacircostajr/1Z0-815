public class TestaDouble {
    public static void main(String[] args) {
        final double MAX_DOUBLE_VALUE = 1.7976931E+308; // max double value at scientific notation
        System.out.printf("\n\nValor máximo permitido em java: %.7e\n", MAX_DOUBLE_VALUE);
        final double ANO_LUZ = 9.461e+15;
        final double DIAMETRO_UNIVERSO = 8.8e+26;
        final double QTD_ESTRELAS_UNIVERSO = 1.0e+22;
        final double QTD_ATOMOS_CORPO_HUMANO = 7.0e+27;
        double TAMANHO_UNIVERSO_OBSERVAVEL = DIAMETRO_UNIVERSO * ANO_LUZ;
        System.out.printf("\nDiâmetro observável do universo:  %.5e", TAMANHO_UNIVERSO_OBSERVAVEL);
        System.out.print(" metros\n");
        System.out.printf("\nQuantidade de estrelas do universo:  %.0e", QTD_ESTRELAS_UNIVERSO);
        System.out.print(" estrelas\n");
        System.out.printf("\nQuantidade de átomos do corpo humano:  %.0e", QTD_ATOMOS_CORPO_HUMANO);
        System.out.print(" átomos\n\n");
    }
}
