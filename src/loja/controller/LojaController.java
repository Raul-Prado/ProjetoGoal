package loja.controller;

import java.util.ArrayList;

import loja.model.Camiseta;
import loja.model.Produto;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository{

	private ArrayList<Camiseta> listaCamisetas = new ArrayList<Camiseta>();
	int numero=0;

	@Override
	public void cadastrarProduto(Camiseta cadastroCamiseta) {
		boolean verificarCamiseta = false;
		for(Camiseta camisetass : listaCamisetas) {
			if(cadastroCamiseta.getProdutoNome().equalsIgnoreCase(camisetass.getProdutoNome())) {
				verificarCamiseta = true;
			}
		}
		if(!verificarCamiseta) {
			listaCamisetas.add(cadastroCamiseta);
			System.out.println("\n O produto foi cadastrado com sucesso!");
		}else {
			System.out.println("\n Já existe um produto com esse nome cadastrado!");
		}
	}
	
	@Override
	public void atualizarProduto(String nome, Camiseta camiseta) {
		Camiseta camisetaEncontrada = buscarCamiseta(nome);
		if(camisetaEncontrada != null) {
			//camisetaEncontrada.setProdutoNome(camiseta.getProdutoNome());
			//camisetaEncontrada.setProdutoPreco(camiseta.getProdutoPreco());
			//camisetaEncontrada.setProdutoQuantidade(camiseta.getProdutoQuantidade());
			//camisetaEncontrada.setTamanho(camiseta.getTamanho());
			listaCamisetas.set(listaCamisetas.indexOf(camisetaEncontrada), camiseta);
			System.out.println("O Produto foi atualizado com sucesso!");
			
		}else {
			System.out.println("O Produto com este nome não encontrado!");
		}
	}

	@Override
	public void excluirProduto(String nome) {
		// 
		int contador = 0;
		int apagar = -1;
		
		for(Camiseta camisetas : listaCamisetas) {
			if(camisetas.getProdutoNome().equalsIgnoreCase(nome)) {
				apagar = contador;
				//System.out.println("Ex");
			}
			contador++;
		}
		if(apagar >= 0) {
			listaCamisetas.remove(apagar);
			System.out.println("O produto foi excluido");
		}else {
			System.out.println("O produto não foi encontrado");
		}
	}

	@Override
	public void listarProduto() {
		for(Camiseta camisetas : listaCamisetas) {
			camisetas.visualizarProdutos();
		}
		
	}
	//metodo de busca do produto
	public Camiseta buscarCamiseta(String nome) {
		for(Camiseta camisetas : listaCamisetas) {
			if(camisetas.getProdutoNome().equalsIgnoreCase(nome)) {
				return camisetas;
			}
		}
		return null;
	}

}
