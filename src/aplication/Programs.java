package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Programs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------");
		System.out.println("Adição de produtos: ");
		System.out.println("-------------------------");

		

		List<Produtos> list = new ArrayList<>();
		char resp;
		do {
			System.out.print("Quantos produtos você quer adicionar? ");
			int n = sc.nextInt();
			
			for (int i = 1; i <= n; i++) {

				sc.nextLine();
				System.out.println("\nProduto nº" + i + ":");
				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();

				System.out.print("Preço: ");
				Double preco = sc.nextDouble();

				System.out.print("Quantidade: ");
				Integer quant = sc.nextInt();

				list.add(new Produtos(nome, preco, quant));
				

			}
			System.out.print("Deseja continuar?[S/N] ");
			resp = sc.next().toUpperCase().charAt(0);
		} while (resp != 'N');

		System.out.println("\nProdutos cadastrados:");
		System.out.println("--------------------------");

		for (Produtos obj : list) {
			System.out.println(obj);
			System.out.println("--------------------------");
		}

		sc.close();
	}

}
