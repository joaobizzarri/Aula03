import java.util.Random;

public class EstruturaSwitchAleatorio {

	public static void main(String[] args) {
		/*Crie um programa que permita ao usu�rio escolher o elogio que gostaria de receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio f�sico, 3 - Elogio pessoal
		 * Caso digite qualquer outro n�mero, deve ser exibida a mensagem "op��o inv�lida"*/
		// Scanner leitor = new Scanner(System.in);
		Random gerador = new Random();
		int opcao;
		System.out.println("ELOGIADOR!");
		// System.out.println("Selecione a op��o desejada:\n1-Elogio profissional\n2-Elogio f�sico\n3-Elogio pessoal");
		// opcao = leitor.nextInt();
		opcao = gerador.nextInt(3);
		//Aqui precisamos de uma estrutura para validar a op��o inserida.
		switch (opcao) {
		case 0:
			System.out.println("Seus ifs s�o lindos demais");
			break;
		case 1:
			System.out.println("A sua densidade �ssea � incr�vel");
			break;	
		case 2:
			System.out.println("Voc� � uma pessoa sensacional");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}

		// leitor.close();

	}

}