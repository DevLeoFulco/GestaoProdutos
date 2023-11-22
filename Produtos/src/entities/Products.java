package entities;

public class Products {
	public String nome;
	public double price;
	public int quantity;
	
	public double totalValorNoEstoque() {
		return price * quantity;
	}
	
	public void adicionarProduto(int quantity) {
		this.quantity += quantity;
	}
	
	public void removerProduto(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return nome +", "+"$ "+String.format("%.2f", price)+" , "+quantity+" unidade, Total de $ "+String.format("%.2f", totalValorNoEstoque());
	}
}
