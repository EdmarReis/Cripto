import javax.swing.JOptionPane;

public class Descripto extends Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleciona = false;
		frase = JOptionPane.showInputDialog("Digite a palavra/frase que deseja descriptografar:");
		char[] valor = transformaEmVetor(frase);
		int[] valor1 = transformaEmIndice(valor);
		String[] valor2 = processa(valor1);
		concatenaAndImprime(valor2);
	}

}
// comentario
