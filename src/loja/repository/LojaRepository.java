package loja.repository;

import loja.model.Camiseta;

public interface LojaRepository {
	// CRUD da loja
	public void cadastrarProduto(Camiseta cadastroCamiseta);
	public void atualizarProduto(String nome, Camiseta camiseta);
	public void excluirProduto(String nome);
	public void listarProduto();
}
