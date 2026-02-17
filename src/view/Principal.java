package view;

import controller.VetorController;

public class Principal {
	public static void main(String[] args) {
		VetorController vc = new VetorController();
		
		int[] vt1k = new int[1000];
		int[] vt10k = new int[10000];
		int[] vt100k = new int[100000];
		double tempoInicial;
		double tempoFinal;
		double tempoTotal;
		
		
		vt1k = vc.preencherVetor(vt1k);
		vt10k = vc.preencherVetor(vt10k);
		vt100k = vc.preencherVetor(vt100k);
		
		tempoInicial = System.nanoTime();
		vc.lerVetor(vt1k);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Tempo 1000 posições: " +tempoTotal +" segundos.");
		
		tempoInicial = System.nanoTime();
		vc.lerVetor(vt10k);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Tempo 10000 posições: " +tempoTotal +" segundos.");
		
		tempoInicial = System.nanoTime();
		vc.lerVetor(vt100k);
		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Tempo 100000 posições: "+tempoTotal +" segundos.");
		
	}
}
