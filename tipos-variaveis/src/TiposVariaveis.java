public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tabela tipo Variaveis
        /*FAMILIA   -   TIPO PRIMITIVO  -   WRAPPER CLASS   -   TAMANHO
         *LÓGICO    -   boolean         -   boolean         -   1 bit
         * LITERAIS -   char            -   Character       -   1 byte
         *          -     -             -   String          -   1 byte/cada
         * INTEIROS -   byte            -   Byte            -   1 byte
         *          -   short           -   Short           -   2 bytes
         *          -   int             -   Integer         -   4 bytes
         *          -   long            -   Long            -   8 bytes
         * REAIS    -   float           -   Float           -   4 bytes 
         *          -   double          -   Double          -   8 bytes
        */


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        int numero = 5;

        numero = 10;
        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;


    }
}
