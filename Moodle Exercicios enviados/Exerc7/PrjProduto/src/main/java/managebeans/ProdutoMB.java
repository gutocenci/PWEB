package managebeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import dao.ProdutoDAO;
import entidade.Produto;

@ManagedBean
@SessionScoped

public class ProdutoMB {
	private Produto produto = new Produto();
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	private List <Produto> produtos;

	public void onRowEdit(RowEditEvent event) {

		Produto produto = ((Produto) event.getObject());
		produtoDAO.alterar(produto);
		produtos = produtoDAO.getAllProduto();

	}

	/*
	 * public ArrayList<Produto> getListaProd(){ return null; }
	 * 
	 * public void setListaProd(ArrayList<Produto> listaProd) {
	 * 
	 * }
	 * 
	 * public Produto getProduto() { return produto; }
	 * 
	 * public void setProduto(Produto produto) { this.produto = produto; }
	 */

	public void remover(Produto produto) {
		produtoDAO.remover(produto);
		produtos = produtoDAO.getAllProduto();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> getListaProd() {
		if (produto == null)
			produtos = produtoDAO.getAllProduto();

		return produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String salvar() {
		produtoDAO.salvar(produto);
		produtos = produtoDAO.getAllProduto();
		produto = new Produto();
		return "";
	}
}
