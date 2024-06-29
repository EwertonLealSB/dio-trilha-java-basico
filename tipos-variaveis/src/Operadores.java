public class Operadores {
    public static void main(String[] args) {
        //Atribuição
        String nome = "Ewerton";
        int idade = 18;
        double peso = 86.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        System.out.printf("%s\n" + "%d\n" +"%2.2f\n" + "%c\n" + "%b\n\n", nome,idade,peso,sexo,doadorOrgao);


        //Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        System.out.println(soma);
        System.out.println(subtração);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.printf("\n",resultado);


        //Concatenação
        String nomeCompleto = "LINGUAGEM " + " JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        System.out.printf("%s\n\n",nomeCompleto);

        //Únarios
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu\n\n " + !verdadeiro);

        //Tenário
        int a, b;
        a = 6;
        b = 6; 
        String valor = (a==b) ? "verdadeiro" : "false";
        System.out.println(valor);

    }
}
