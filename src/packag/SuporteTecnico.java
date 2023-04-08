package packag;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SuporteTecnico {
	
	private HashMap<String, String> bancoSolucao;
	private ArrayList<String> respostaPadrao;
	
	public SuporteTecnico() {
		this.bancoSolucao = new HashMap<String, String>();
		this.respostaPadrao = new ArrayList<String>();
		preencherBanco();
		preencherRespostaPadrão();
	}
//	public SuporteTecnico (HashMap<String, String> bancoSolucao, ArrayList<String> respostaPadrao) {		
//
//		this.bancoSolucao = bancoSolucao;
//		this.respostaPadrao = respostaPadrao;
//		preencherBanco();
//		preencherRespostaPadrão();
//	}

	public HashMap<String, String> getBancoSolucao() {
		return bancoSolucao;
	}
	
	public void setBancoSolucao(HashMap<String, String> bancoSolucao) {
		this.bancoSolucao = bancoSolucao;
	}
	public ArrayList<String> getRespostaPadrao() {
		return respostaPadrao;
	}
	public void setRespostaPadrao(ArrayList<String> respostaPadrao) {
		this.respostaPadrao = respostaPadrao;
	}
	
	private void preencherBanco() {
		bancoSolucao.put("lento", "Penso que o problema está relacionado com o hardware. Fazer um upgrade\n do seu processador deve resolver o problema de performance. Você tem algum\n problema com o software?");
		bancoSolucao.put("performance", "A performance está próxima do esperado nos testes que realizamos. Você está\n executando algum outro processo em paralelo?");
		bancoSolucao.put("bug", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
		bancoSolucao.put("buggy", "Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software\n já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema\n com mais detalhes?");
		bancoSolucao.put("windows", "Este é um problema do sistema operacional Windows. Por favor, \n entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.");
		bancoSolucao.put("macintosh", "Este é um problema do sistema operacional Mac. Por favor, \n entre em contato com a Apple. Não há nada que possamos fazer neste caso.");
		bancoSolucao.put("caro", "O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado\n e comparou todas as características do nosso software com outras ofertas de mercado?");
		bancoSolucao.put("instalação","A instalação é simples e direta. Nós temos programas de instalação previamente configurados\n que farão todo o trabalho para você. Você já leu as instruções\n de instalação?");
		bancoSolucao.put("memória", "Se você observar detalhadamente os requisitos mínimos de sistema, você verá que\n a memória requerida é 1.5 giga byte. Você deverá adquirir\n mais memória. Mais alguma coisa que deseja saber?");
		bancoSolucao.put("linux", "Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas.\n Muitos deles dizem respeito a versões incompatíveis. Você poderia ser\n mais preciso?");
		bancoSolucao.put("danificaram", "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
		bancoSolucao.put("danificou",  "Bom, nosso software não danificaria seu sistema. Deve ser algo específico\n no seu sistema. Diga-me sobre sua configuração.");
	}
	private void preencherRespostaPadrão() {
		respostaPadrao.add("Isso soa estranho. Você poderia descrever o problema com mais detalhes?");
		respostaPadrao.add("Nenhum outro cliente detalhou um problema parecido com este. \n Qual é a sua configuração de sistema?");
		respostaPadrao.add("Isso parece interessante. Diga-me mais a respeito...");
		respostaPadrao.add("Preciso de maiores informações a respeito.");
		respostaPadrao.add("Você já verificou se existe algum conflito de DLL?");
		respostaPadrao.add("Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?");
		respostaPadrao.add("Sua descrição não foi satisfatória. Você já procurou um técnico\n que poderia detalhar melhor este problema?");
		respostaPadrao.add("Isso não é um problema, é apenas uma característica do software!");
		respostaPadrao.add("Você poderia explicar melhor?");
		
	}
	public ArrayList<String> pesquisaSolucao(HashSet<String> palavras) {
		
		ArrayList<String> solucoes = new ArrayList<String>();
		
		Set<String> chaves = bancoSolucao.keySet(); // obter as chaves do banco
		chaves.retainAll(palavras); // reter apenas as chaves presentes no conjunto de palavras
		
			for(String solucao:	chaves)
			     solucoes.add(bancoSolucao.get(solucao));
			
		if(solucoes.size() > 0)
			return solucoes;
			else
				return null;

		
	}
	public String pesquisaSolucaoAleatoria() {
		Random random = new Random();
		int numeroInteiro = random.nextInt(8);
		
	    return respostaPadrao.get(numeroInteiro);

	}
	
}
