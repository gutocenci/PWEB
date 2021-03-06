package entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private int codigo;
	private String nome, validade, fornecedor;
	private double qtdemin;

	public int getCodigo() {
		return codigo;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public double getQtdemin() {
		return qtdemin;
	}

	public void setQtdemin(double qtdemin) {
		this.qtdemin = qtdemin;
	}

}
