package controller;

public class VetorController {
	public int[] preencherVetor(int[] vt) {
		for (int i = 0; i<vt.length; i++) {
			vt[i] = 0;
		}
		return vt;
	}
	
	public void lerVetor(int[] vt) {
		int soma = 0;
		for (int i = 0; i<vt.length; i++) {
			soma += vt[i];
		}
	}
}
