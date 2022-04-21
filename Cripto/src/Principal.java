import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {

	public static String frase = "";
	public static boolean seleciona = true;
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

	public static char[] transformaEmVetor(String frase) {
		char[] texto = new char[300];
		for (int i = 0; i < frase.length(); i++) {
			texto[i] = frase.charAt(i);
			// System.out.println("Caractere na posição " + i + " = " + texto[i]);
		}
		return texto;
	}

	public static int[] transformaEmIndice(char[] texto) {
		int[] arrayIndex = new int[300];
		int getIndex;
		for (int i = 0; i < frase.length(); i++) {
			String temp = Character.toString(texto[i]);
			if (seleciona)
				getIndex = Arrays.asList(alfa).indexOf(temp);
			else
				getIndex = Arrays.asList(crip).indexOf(temp);
			// System.out.println("index = " + getIndex);
			arrayIndex[i] = getIndex;
		}
		return arrayIndex;
	}

	public static String[] processa(int[] arrayIndex) {
		String[] codificada = new String[300];
		for (int i = 0; i < frase.length(); i++) {
			if (seleciona)
				codificada[i] = crip[arrayIndex[i]];
			else
				codificada[i] = alfa[arrayIndex[i]];
			// System.out.println(codificada[i]);
		}
		return codificada;
	}

	public static void concatenaAndImprime(String[] codificada) {
		String result = "";
		for (int i = 0; i < frase.length(); i++) {
			result = result + codificada[i];
		}
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}