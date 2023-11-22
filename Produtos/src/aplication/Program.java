package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		System.out.println("------- Insira o nome do produto -------");
		System.out.print("Digite o nome do produto: ");
		product.nome = sc.nextLine();
		System.out.print("Digite o preço do produto: ");
		product.price = sc.nextDouble();
		System.out.print("Digite a quantidade de produto: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Descrição do Produto: "+product);
		
		System.out.println();
		System.out.print("Insira a quantidade de produtos que deseja adicionar ao estoque: ");
		int quantity = sc.nextInt();
		product.adicionarProduto(quantity);
		
		System.out.println("Novos dados de Produto: "+product);
		
		System.out.println();
		System.out.print("Insira a quantidade de produtos que deseja remover ao estoque: ");
		quantity = sc.nextInt();
		product.removerProduto(quantity);
		
		System.out.println("Novos dados de Produto: "+product);
		
		
		
		sc.close();
	}

}
