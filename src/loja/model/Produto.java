package loja.model;

public abstract class Produto {
	//atributos/variaveis
	private String produtoNome;
	private int produtoQuantidade;
	private double produtoPreco;
	
	//Método Construtor com argumentos tipo um formulario
	public Produto (String produtoNome, int produtoQuantidade, double produtoPreco) {
		this.produtoNome = produtoNome;
		this.produtoQuantidade = produtoQuantidade;
		this.produtoPreco = produtoPreco;
	}
	
	//Método de acesso(Get=pegar/set=atualizar)
	public String getProdutoNome() {
		return this.produtoNome;
	}
	public void setProdutoNome(String ProdutoNome) {
		this.produtoNome = ProdutoNome;
	}
	
	public int getProdutoQuantidade() {
		return this.produtoQuantidade;
	}
	public void setProdutoQuantidade(int ProdutoQuantidade) {
		this.produtoQuantidade = ProdutoQuantidade;
	}
	
	public double getProdutoPreco() {
		return this.produtoPreco;
	}
	public void setProdutoPreco(double ProdutoPreco) {
		this.produtoPreco = ProdutoPreco;
	}
	
	//Métodos Específicos
	//visualizar
	public void visualizarProdutos() {
		System.out.println("\n\n*******************************************************");
		System.out.println("Produto Cadastrado (Produto)");
		System.out.println("***********************************************************");
		System.out.println("Nome do Produto: " + this.produtoNome);
		System.out.println("Quantidade do Produto: " + this.produtoQuantidade);
		System.out.println("Preço do Produto: " + this.produtoPreco);
	}
	
}
