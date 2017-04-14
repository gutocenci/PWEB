package Produto.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	private String descricao, undMedida, fornecedor, pericivel;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUndMedida() {
		return undMedida;
	}
	public void setUndMedida(String undMedida) {
		this.undMedida = undMedida;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getPericivel() {
		return pericivel;
	}
	public void setPericivel(String pericivel) {
		this.pericivel = pericivel;
	}	
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", undMedida=" + undMedida + ", fornecedor=" + fornecedor + ", pericivel=" + pericivel + "]";
	}
	
}
