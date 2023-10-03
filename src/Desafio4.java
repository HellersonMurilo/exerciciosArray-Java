import java.util.ArrayList;
import java.util.List;

public class Desafio4 {

	public static void main(String[] args) {
		// Desafio 4
		
		//4 - Dado uma array com vários nomes, retornar a maior string deste array.
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Murilo");
		nomes.add("Giovanna");
		nomes.add("Dayana");	
		nomes.add("Hellerson");
		nomes.add("Calabianqui");
		nomes.add("Bezerra");
		
		int maiorComprimento = 0;
		String maiorNome = "inicio";
		
		for (String string : nomes) {
			int comprimentoString = string.length(); //lenght so vai em Variaveis Int
			if (comprimentoString > maiorComprimento) {
				maiorComprimento = comprimentoString;
				maiorNome = string;
			}
		}
		System.out.println("O maior nome contem " + maiorComprimento + " e é o " + maiorNome);

	} 

}