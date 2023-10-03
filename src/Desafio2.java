
public class Desafio2 {

	public static void main(String[] args) {
	    //Desafio 2
		
		//2 - Localizar o maior valor dentro de um array de números.
		
		int[] meuArray = {1, -8, 9, 19, -87, 99, 17, 20};
		int maiorValor = 0;
		
		for (int i = 0; i < meuArray.length; i++) {
			if (meuArray[i] > maiorValor) {
				maiorValor = meuArray[i];
			}
		}
		System.out.println(maiorValor);
	}

}
