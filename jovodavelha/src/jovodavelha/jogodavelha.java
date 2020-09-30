package jovodavelha;

public class jogodavelha {

	private String[][] posicoes = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

	public String Mostrar() {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("  " + posicoes[linha][coluna]);
			}
			System.out.println("\n");
		}
		return null;
	}

	public boolean valido(String posicao) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (posicoes[linha][coluna].equals(posicao))
					return true;
			}

		}
		return false;
	}

	public void Jogar(String jogador, String jogada) {
		if (jogador.equals("1"))
			posicoes[0][0] = jogada;
		else if (jogador.equals("2"))
			posicoes[0][1] = jogada;
		else if (jogador.equals("3"))
			posicoes[0][2] = jogada;
		else if (jogador.equals("4"))
			posicoes[1][0] = jogada;
		else if (jogador.equals("5"))
			posicoes[1][1] = jogada;
		else if (jogador.equals("6"))
			posicoes[1][2] = jogada;
		else if (jogador.equals("7"))
			posicoes[2][0] = jogada;
		else if (jogador.equals("8"))
			posicoes[2][1] = jogada;
		else if (jogador.equals("9"))
			posicoes[2][2] = jogada;
	}

	public String Ganhador(int jogadas) {
		String[] Tentativas = new String[8];
		String vencedor = "null";
		if (jogadas == 9) {
			vencedor = "EMPATE! NINGUÉM GANHOU :(";
		}
		// Linhas Horizontais
		Tentativas[0] = posicoes[0][0] + posicoes[0][1] + posicoes[0][2];
		Tentativas[1] = posicoes[1][0] + posicoes[1][1] + posicoes[1][2];
		Tentativas[2] = posicoes[2][0] + posicoes[2][1] + posicoes[2][2];
		// Linhas Verticais
		Tentativas[3] = posicoes[0][0] + posicoes[1][0] + posicoes[2][0];
		Tentativas[4] = posicoes[0][1] + posicoes[1][1] + posicoes[2][1];
		Tentativas[5] = posicoes[0][2] + posicoes[1][2] + posicoes[2][2];
		// Linhas Diagonais
		Tentativas[6] = posicoes[0][0] + posicoes[1][1] + posicoes[2][2];
		Tentativas[7] = posicoes[0][2] + posicoes[1][1] + posicoes[2][0];

		for (int i = 0; i < Tentativas.length; i++) {
			if (Tentativas[i].equals("XXX")) {
				vencedor = "Jogador 1 Venceu!";
			} else if (Tentativas[i].equals("OOO"))
				vencedor = "Jogador 2 Venceu!";
		}
		return vencedor;
	}

}
