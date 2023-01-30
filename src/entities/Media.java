package entities;

public class Media {

	private double media;

	public Media(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public boolean aprovado() {
		return media <= 10 && media >= 7;
	}

	public boolean recuperacao() {
		return media <= 7 && media >= 4.5;
	}

	public boolean reprovado() {
		return media <= 4.5 && media >= 0;
	}

//	public void excecao() throws RuntimeException {
//		if (!aprovado() && !recuperacao() && !reprovado()) {
//			throw new RuntimeException("Unexpected error");
//		}
//	}

	public void operacao() {
		if (aprovado()) {
			return;
		} else if (recuperacao()) {
			return;
		} else if (reprovado()) {
			return;
		}

	}

}
