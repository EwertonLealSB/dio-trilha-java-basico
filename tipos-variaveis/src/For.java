public class For {
    public static void main(String[] args) {
        //estrutura 1
		for(int carneirinhos = 0 ; carneirinhos <=5; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 6;
        for( ; carneirinhos <=10; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
        //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }

        //estrutura 3 - for em arrays
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	    }
    }
}

