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

		try {
			System.out.println(m.operacao());
		} catch (RuntimeException e) {
			System.out.print(e.getMessage());
		}

		sc.close();
	}

}
