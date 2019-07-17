package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.model.Pedido;

public interface OrderDao {
	public List<Pedido> listarPedidos(int id_cliente);
}
