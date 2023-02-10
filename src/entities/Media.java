package entities;

public class Media {

	private double media;

	public Media(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public String operacao() {
		if (media <= 10 && media >= 7) {
			return "Aprovado";
		} else if (media < 7 && media >= 4.5) {
			return "Recuperação";
		} else if (media < 4.5 && media >= 0) {
			return "Reprovado";
		} else {
			throw new RuntimeException("Invalid command: Unexpected error");
		}
	}

}
