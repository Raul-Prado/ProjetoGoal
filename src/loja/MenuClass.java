package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.Camiseta;
//importanto lojamodel
import loja.model.Produto;

public class MenuClass {

	public static void main(String[] args) {

		LojaController camisetas = new LojaController();

		// instanciar objeto
		// LojaModel loja = new LojaModel("Camisa Basic(Hering)", 2 , 39.99);
		// produtos.listarProduto();

		// atributos/variaveis
		int opcoes, quantidadeProd;
		double precoProd;
		String nomeProd, tamanho;

		// ler dados
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            Area Adminitrativa do E-commerce         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Alterar Produto                      ");
			System.out.println("            3 - Excluir Produto                      ");
			System.out.println("            4 - Listar Produto                       ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			// tratamento de erro
			try {
				opcoes = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros");
				opcoes = 0;
			}

			switch (opcoes) {
			case 1:
				scanner.nextLine();
				System.out.println("Cadastrar Produto\n");
				System.out.println("Digite o nome do produto: ");
				nomeProd = scanner.nextLine().toLowerCase();
				
				System.out.println("**************************");
				System.out.println("Digite quantidade do produto: ");
				quantidadeProd = scanner.nextInt();
				System.out.println("**************************");
				System.out.println("Digite o preço do produto: ");
				precoProd = scanner.nextDouble();
				System.out.println("**************************");
				scanner.nextLine();
				System.out.println("Digite o tamanho do produto: ");
				tamanho = scanner.nextLine().toUpperCase();
				//scanner.skip("\\R?");
				Camiseta camisetass =  new Camiseta(nomeProd, quantidadeProd, precoProd, tamanho);
				camisetas.cadastrarProduto(camisetass);
				//camisetas.cadastrarProduto(new Camiseta(nomeProd, quantidadeProd, precoProd, tamanho));
				keyPress();
				break;
			case 2:
				System.out.println("Alterar Produto\n");
				scanner.nextLine();
				System.out.println("Digite o nome do produto: ");
				nomeProd = scanner.nextLine().toLowerCase();
				System.out.println("Digite aquantidade do produto atualizado: ");
				quantidadeProd = scanner.nextInt();
				System.out.println("Digite o preco do produto atualizado: ");
				precoProd = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("O tamanho do produto atualizado: ");
				tamanho = scanner.nextLine().toUpperCase();
				//instanciando
				Camiseta camisetaa = new Camiseta(nomeProd, quantidadeProd, precoProd, tamanho);
				camisetas.atualizarProduto(nomeProd, camisetaa);
				keyPress();
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Excluir Produto\n");
				System.out.println("Digite o nome do produto: ");
				nomeProd = scanner.nextLine();
				camisetas.excluirProduto(nomeProd);
				keyPress();
				break;
			case 4:
				System.out.println("Listar Produtos\n");
				camisetas.listarProduto();
				keyPress();
				break;
			case 5:
				System.out.println("Saindo do sistema\n");
				System.exit(0);
				break;
			default:
				System.out.println("\n Opção Inválida!\n");
				keyPress();
				break;
			}

		}

	}

	//
	public static void keyPress() {
		try {
			System.out.println("\n Pressione Enter para continuar!");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
