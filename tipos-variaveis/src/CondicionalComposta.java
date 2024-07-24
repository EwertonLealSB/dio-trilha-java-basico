public class CondicionalComposta {
    public static void main(String[] args) {
        //Nesse exemplo de resultado escolar, tem condicionais composta, encadeadas e ténarias
        //Condicional Composta
        int nota = 6;
        
        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado"); 

        //Condicionais encadeadas
        int nota1 = 6;

	    if (nota1 >= 7)
	    	System.out.println("Aprovado");
	    else if (nota1 >= 5 && nota1 < 7)
	    	System.out.println("Recuperação");
	    else
	    	System.out.println("Reprovado");

        //Condição ténarias
        //Cenário 1
        int nota2 = 7;
		String resultado2 = nota2 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado2);

        //Cenário 2
        //obs: "?" =  if, ":" = else
        int nota3 = 6;
		String resultado3 = nota >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado3);
    }
}   
