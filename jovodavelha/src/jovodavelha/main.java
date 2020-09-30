package jovodavelha;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		jogodavelha jogo = new jogodavelha();
		String posicao;
		int valida = 0, jogadas = 0;

		while (true) {
			System.out.println("*** Jogo da Velha ***");
			jogo.Mostrar();

			// Iniciar Jogador 1
			do {
				System.out.print("Jogador 1, informe uma posi��o: ");
				posicao = ler.next();
				while (!jogo.valido(posicao)) {
					System.out.println("Jogada inv�lida, tente novamente!");
					System.out.print("Jogador 1, informe uma posi��o: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogar(posicao, "X");
				valida = 1;

			} while (valida == 0);

			jogadas++;
			valida = 0;
			jogo.Mostrar();
			if (!jogo.Ganhador(jogadas).equals("null")) {
				break;
			}
			// Iniciar Jogador 2
			do {
				System.out.print("Jogador 2, informe uma posi��o: ");
				posicao = ler.next();
				while (!jogo.valido(posicao)) {
					System.out.println("Campo j� preenchido, tente novamente!");
					System.out.print("Jogador 2, informe uma posi��o: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.Jogar(posicao, "O");
				valida = 1;

			} while (valida == 0);

			jogadas++;
			valida = 0;
			jogo.Mostrar();
			if (!jogo.Ganhador(jogadas).equals("null")) {
				break;
			}

		}
		System.out.println(jogo.Ganhador(jogadas));

	}

}