import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		// Desafios
		
		//1 - Criar uma função que receba como parâmetro um array de números e retorne um array contendo somente números positivos.
		
		//criando a array
		int[] meuArray = {1, -8, 9, 19, -87, 99, 17, 20};
		List<Integer> numerosPositivosList = new ArrayList<>();
		
		for (int i = 0; i < meuArray.length; i++) {
			if (meuArray[i] > 0) {
				numerosPositivosList.add(meuArray[i]);
			}
		}
		
		//printar cada elemento da lista
		for (int i : numerosPositivosList) {
			System.out.println(i);
		}
		
	}
	
}
