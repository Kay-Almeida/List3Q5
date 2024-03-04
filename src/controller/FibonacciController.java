package controller;

public class FibonacciController {
	public FibonacciController () {
		super (); 
	}
	
	public int calcularFibonacci(int posicao) {
        // Condição de parada dada que se a posição for 1 ou 2, retorna 1
        if (posicao == 1 || posicao == 2) {
            return 1;
        } else {
            // recursiva soma dos dois valores anteriores na série até chegar no valor 
            return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
        }
    }
	
	

}
