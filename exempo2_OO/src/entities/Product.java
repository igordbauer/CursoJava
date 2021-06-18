package entities;

public class Product {

	public String name;
	public double price;
	public int quantity; // classe p�blica que � a estrutura de um produto

	public double totalvalueInStock() {
		return price * quantity; // m�todo que retorna o valor total de todas as mercadorias em estoque
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // this.quantity refere-se ao quantity dentro da classe enquanto quantity no
									// argumento � o valor que veio como argumento na chamada da func�o.

	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public  String toString() {
		return name + ", $ "+ String.format("%.2f",price) +", "+ quantity +" unitis, Total $ "+ String.format("%.2f",totalvalueInStock());
	}
	
}
