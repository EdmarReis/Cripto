
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteCripto {

	public static String frase = "e d";
	public static String[] alfa = { "\"", "\'", "!", "1", "@", "2", "#", "3", "$", "4", "%", "5", "¨", "6", "&", "7",
			"*", "8", "(", "9", ")", "0", "_", "-", "+", "=", "|", "\\", "`", "´", "{", "[", "^", "~", "}", "]", "<",
			",", ">", ".", ":", ";", "?", "/", " ", "Q", "q", "W", "w", "E", "e", "R", "r", "T", "t", "Y", "y", "U",
			"u", "I", "i", "O", "o", "P", "p", "A", "a", "S", "s", "D", "d", "F", "f", "G", "g", "H", "h", "J", "j",
			"K", "k", "L", "l", "Ç", "ç", "Z", "z", "X", "x", "C", "c", "V", "v", "B", "b", "N", "n", "M", "m" };
	public static String[] crip = { "R", "t", "K", "9", "3", "(", "%", "W", "¨", " ", "G", "5", "[", "A", "F", "j", "0",
			"Z", "x", "S", "v", "u", "7", "2", ":", "~", "=", "´", "o", ">", ".", "L", "m", ";", "?", "|", "/", "}",
			"H", "h", "D", "i", "N", "p", "Y", "ç", "c", "B", "'", "#", "\"", "*", "-", "O", "l", "e", "@", "`", "!",
			"$", "E", "f", "g", "C", "J", "s", "I", "Q", "T", "X", "P", "{", "]", "^", "\"", "1", "8", "4", "6", "&",
			"V", "w", "U", ")", "_", ",", "+", "a", "b", "d", "M", "n", "q", "Ç", "k", "y", "z", "r", "<" };
	public static int[] arrayIndex = new int[300];
	public static int getIndex;
	public static String[] codificada = new String[300];
	public static String result = "";
	public static char[] texto = new char[300];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// joga a palavra/frase num array de caractere

		for (int i = 0; i < frase.length(); i++) {
			texto[i] = frase.charAt(i);
			System.out.println("Caractere na posição " + i + " = " + texto[i]);
		}

		// transforma a frase/palavra no indice da letra correspondente de alfa
		for (int i = 0; i < frase.length(); i++) {
			String temp = Character.toString(texto[i]);
			getIndex = Arrays.asList(alfa).indexOf(temp);
			System.out.println("index = " + getIndex);
			arrayIndex[i] = getIndex;
		}

		// System.out.println(alfa.length);
		// System.out.println(crip.length);

		// colocar a frase codificada em formato de vetor, dando as letras codificadas
		// correspondentes a letra original
		for (int i = 0; i < frase.length(); i++) {
			codificada[i] = crip[arrayIndex[i]];
			System.out.println(codificada[i]);
		}

		// ordena o vetor codificado em uma String
		for (int i = 0; i < frase.length(); i++) {
			result = result + codificada[i];
		}

		System.out.println(result);

	}

	public char[] transformaEmVetor(String frase) {
		char[] texto = new char[300];
		for (int i = 0; i < frase.length(); i++) {
			texto[i] = frase.charAt(i);
			System.out.println("Caractere na posição " + i + " = " + texto[i]);
		}
		return texto;
	}

	public int[] transformaEmIndice(char[] texto) {
		int[] arrayIndex = new int[300];
		int getIndex;
		for (int i = 0; i < frase.length(); i++) {
			String temp = Character.toString(texto[i]);
			getIndex = Arrays.asList(alfa).indexOf(temp);
			System.out.println("index = " + getIndex);
			arrayIndex[i] = getIndex;
		}
		return arrayIndex;
	}

	public String[] processa(int[] arrayIndex) {
		String[] codificada = new String[300];
		for (int i = 0; i < frase.length(); i++) {
			codificada[i] = crip[arrayIndex[i]];
			System.out.println(codificada[i]);
		}
		return codificada;
	}
	
	public void concatenaAndImprime(String[] codificada) {
		String result = "";
		for (int i = 0; i < frase.length(); i++) {
			result = result + codificada[i];
		}
		System.out.println(result);
	}
	
}
