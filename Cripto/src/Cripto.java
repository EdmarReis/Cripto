import javax.swing.JOptionPane;

public class Cripto extends Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frase = JOptionPane.showInputDialog("Digite a palavra/frase que deseja criptografar:");
		char[] valor = transformaEmVetor(frase);
		int[] valor1 = transformaEmIndice(valor);
		String[] valor2 = processa(valor1);
		concatenaAndImprime(valor2);
		
	}

}
