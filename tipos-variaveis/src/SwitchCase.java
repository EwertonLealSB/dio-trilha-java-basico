public class SwitchCase {
    // Modo condicional if/else
    public static void main(String[] args) {
		String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		

    // Modo condicional switch / case
    String sigla1 = "M";

		switch (sigla1) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
		
        //Algoritmo de plano telefônico

        String plano = "T"; // B = Basic / M = Midia / T = Turbo

        switch (plano){
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
                break;
            case "T":
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.");
                break;
            
        };
            


		
	}
}
