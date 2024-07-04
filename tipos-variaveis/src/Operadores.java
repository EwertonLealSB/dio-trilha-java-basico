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
        System.out.printf("\n",valor);

        //Relacional 
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; 
        System.out.printf("\n",simNao);
        
        if(numero1 > numero2)
        	System.out.print("Numero 1 maior que numero 2\n");

        if(numero1 < numero2)
        	System.out.print("Numero 1 menor que numero 2\n");

        if(numero1 >= numero2)
        	System.out.print("Numero 1 maior ou igual que numero 2\n");

        if(numero1 <= numero2)
        	System.out.print("Numero 1 menor ou igual que numero 2\n\n");

        //// ComparacaoAvancada
        if(numero1 != numero2)
        	System.out.print("Numero 1 é diferente de numero 2\n");

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); //true
    
        String nome3 = new String("JAVA");
        System.out.println(nome1 == nome3); //false
    
        String nome4 = nome3;
        System.out.println(nome3 == nome4); //true

        int numero3 = 130;
        int numero4 = 130;
        System.out.println(numero3 == numero4); //true
        
        Integer numero5 = 130;
        Integer numero6 = 130;
    
        System.out.println(numero5 == numero6); //false
        
        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals
        
         System.out.println(numero5.equals(numero6));


        
        //Lógico: && Operador Lógico "E", || Operador Lógico "OU"
        boolean condicao1=true;
        boolean condicao2=false;
        
        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
         "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */
        
        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;
        
        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro\n");
    }   
}
