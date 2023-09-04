package repetiçoes;

import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);
		int N;
		
		System.out.println("digite um valor maior que 0");
		N = print.nextInt();
		
		if (N <= 0) {
			System.out.println("o valor deve ser maior que 0");
		} else {
			System.out.println("numeros entre 1 " + N + ":");
			for(int i = 1 ; i <=N; i++ ) {
				System.out.println(i);
			}
		}

	}

}
