package managedbeans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.ClienteDAO;
import entidades.Cliente;

@ManagedBean
@SessionScoped
public class ClienteMB {
	private Cliente cliente = new Cliente();
    private ClienteDAO clienteDAO = new ClienteDAO();
	
    
    
    
	public ArrayList<Cliente> getListaCli() {
		return null;
	}

	public void setListaCli(ArrayList<Cliente> listaCli) {
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String salvar(){
		clienteDAO.salvar(cliente);
		cliente = new Cliente();
		return "";
	}
}
