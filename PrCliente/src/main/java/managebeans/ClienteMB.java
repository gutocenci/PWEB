package managebeans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Cliente;

@ManagedBean
@SessionScoped


public class ClienteMB {
	private Cliente cliente = new Cliente();
	private ArrayList<Cliente> ListaCli = new ArrayList<Cliente>();
	//private ArrayList<Cliente> ListaCli = new ArrayList<Cliente>();
	
	
	
	public ArrayList<Cliente> getListaCli() {
		return ListaCli;
	}

	public void setListaCli(ArrayList<Cliente> listaCli) {
		ListaCli = listaCli;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String salvar(){
		ListaCli.add(cliente);
		cliente = new Cliente();
		return "";
	}
	
	
}
