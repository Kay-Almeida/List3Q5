package view;

import controller.FibonacciController;

public class Principal {
	public static void main(String[] args) {
		FibonacciController fb = new FibonacciController(); 
		
        int posicao = 10; 

        if (posicao > 0 && posicao <= 20) {
            System.out.println("O valor na posição " + posicao + " da série de Fibonacci é: " + fb.calcularFibonacci(posicao));
        } else {
            System.out.println("Entrada inválida!. A posição deve estar entre 1 e 20.");
        }	
	}
}
