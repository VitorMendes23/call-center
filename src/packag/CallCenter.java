package packag;

import java.util.ArrayList;
import java.util.Scanner;


public class CallCenter {
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		boolean continuarCallCenter = true;
		
		System.out.print("Bem-vindo ao sistema de Suporte Técnico\n");
		System.out.print("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.\n\n");
		
	    String resosta = scanner.nextLine();
	    
	    if(resosta.equals("sair")) {
        	scanner.close();
        	System.out.println("Programa encerrando...");
        	System.exit(0); 
	    }


		while (continuarCallCenter) {

			Interpretadora interpetradora = new Interpretadora();
			SuporteTecnico suporteTecnico = new SuporteTecnico();
		    	
			System.out.print("Descreva seu problema de maneira sucinta.\n");
		    String problema = scanner.nextLine();

		    
		    interpetradora.separarPalavras(problema);
		    ArrayList<String> resultado = suporteTecnico.pesquisaSolucao(interpetradora.getpalavrasChave());
		    
		    
		    if(resultado != null) {
		    	for(String result: resultado)
				System.out.print(result + "\n");
		    }else {
				System.out.print(suporteTecnico.pesquisaSolucaoAleatoria() + "\n");
		    }
		   
		    System.out.printf("\n Deseja continuar o CallCenter? Sim[1] Não[0]\n");
		    int opcao = scanner.nextInt();
	        scanner.nextLine(); // Consumir o caractere '\n'


		    while (opcao != 0 && opcao != 1) {
		        System.out.printf("Digite uma opção válida: 1 para Sim ou 0 para Não\n");
		        opcao = scanner.nextInt();
		        scanner.nextLine(); // Consumir o caractere '\n'

		    }

		    if (opcao == 0) {
				scanner.close();
				System.out.println("Programa encerrando...");
				System.out.println("Obrigada por utilizar nossos serviços!");
				System.exit(0); 
				scanner.close();
		        continuarCallCenter = false;

		    }

			
		}
		

	}

}
