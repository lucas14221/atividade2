package repetiçoes;

import java.util.Scanner;

public class atividade5_pulei_2_questoes {

	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);
		double nota1, nota2, media;
		
		do {
			System.out.print("digite sua primeira nota (valor entre 0 a 10)");
			nota1 = print.nextDouble();
			
		} while (nota1 < 0 || nota1 > 10 );
		
		do {
			System.out.print("digite sua segunda nota (valor entre 0 a 10)");
			nota2= print.nextDouble();
			
		} while (nota2 < 0 || nota2 > 10);
		
		media = (nota1 + nota2)/2;
		
		System.out.print("sua media foi " + media);
		
	}
}
