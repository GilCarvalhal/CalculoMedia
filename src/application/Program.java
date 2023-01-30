package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a média:");
		double media = sc.nextDouble();

		Media m = new Media(media);

	//	try {
			if (m.aprovado()) {
				System.out.println("Aprovado");
			} else if (m.recuperacao()) {
				System.out.println("Recuperação");
			} else if (m.reprovado()) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Invalid command: Unexpected error");
			}
//		} catch (RuntimeException e) {
//			System.out.print("Invalid command: " + e.getMessage());
//		}

		sc.close();
	}

}
