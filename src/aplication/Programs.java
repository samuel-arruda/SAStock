package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import entities.Clients;
import entities.Order;
import entities.OrderItem;
import entities.Produtos;
import entitiesEnums.OrderStatus;

public class Programs {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		
		System.out.println("-------------------------");
		System.out.println("Insira os dados do cliente: ");
		System.out.println("-------------------------");

		System.out.print("Nome do cliente: ");
		String name = sc.nextLine();
		
		System.out.print("Email do cliente: ");
		String email = sc.nextLine();
		
		System.out.print("Data de aniversario do cliente: ");
		Date dataAniver = sdf.parse(sc.next());
		
		Clients client = new Clients(name, email, dataAniver);
		
		System.out.println("---------------------------");
		System.out.println("Insira os dados do pedido:");
		System.out.println("---------------------------");
		
		Date moment = new Date();
		sdf2.format(moment);
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
		
		Order pedido = new Order(moment, status, client);
		
		System.out.print("Quantos itens cabem neste pedido? ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n ; i++) {
			sc.nextLine();

			System.out.println("Digite os dados do item nº" + i + ":");
			
			System.out.print("Nome do produto: ");
			String nomeProd = sc.nextLine();
			
			
			System.out.print("Preço do produto: ");
			Double price = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			Integer quant = sc.nextInt();
			
			Produtos prod = new Produtos(nomeProd, price);
		
			OrderItem item = new OrderItem(price, quant, prod);
			pedido.addItem(item);
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println(pedido);

		sc.close();
	}

}
