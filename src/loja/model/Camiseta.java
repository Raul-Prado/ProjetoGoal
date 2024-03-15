package loja.model;

public class Camiseta extends Produto{
	private String tamanho;
	
	//construtor
	public Camiseta(String produtoNome, int produtoQuantidade, double produtoPreco, String tamanho) {
		//parametros da classe produto
		super(produtoNome, produtoQuantidade, produtoPreco);
		
		this.tamanho = tamanho;
	}
	//metodos get e set(pegar e alterar)
	public String getTamanho() {
		return this.tamanho;
		}
	public void setTamanho(String tamanhoRecebido) {
		this.tamanho = tamanhoRecebido; 
	}
	//metodo 
	public void visualizarProdutos() {
		//sobrecarga do metodo visualizarProdutos que esta na classe produto
		super.visualizarProdutos();
		System.out.println("Tamanho da Camiseta: " + this.tamanho);
	}
	
}
