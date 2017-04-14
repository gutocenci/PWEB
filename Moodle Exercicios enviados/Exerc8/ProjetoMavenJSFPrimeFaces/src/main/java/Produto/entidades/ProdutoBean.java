package Produto.entidades;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import Produto.entidades.Produto;


@ManagedBean
@SessionScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	private List <Produto> produtos;
	
	public void onRowEdit(RowEditEvent event) {

  		Produto produto = ((Produto) event.getObject());
  	    produtoDAO.alterar(produto);
  	    produtos = produtoDAO.getAllProdutos();
  	}

	public void remover(Produto produto){
    	produtoDAO.remover(produto);
    	produtos = produtoDAO.getAllProdutos();
    }
    
    
	public List<Produto> getListaProduto() {
		if(produtos == null)
			produtos = produtoDAO.getAllProdutos();
		
		return produtos;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
		
	public ProdutoDAO getProdutoDAO() {
		return produtoDAO;
	}
	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}
	
	public String salvar(){
		produtoDAO.salvar(produto);
		produtos = produtoDAO.getAllProdutos();
		produto = new Produto();
		return "";
	}
}
