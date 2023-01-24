package operadorIf;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a média:");
		double media = input.nextDouble();

		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!!");
		}

		else if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação!!!");
		}

		else if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado!!!");
		} else {
			System.out.println("Error!!!");
		}

		input.close();
	}

}
