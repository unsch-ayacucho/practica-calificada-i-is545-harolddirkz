package pe.edu.unsch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.OrderDao;
import pe.edu.unsch.model.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService{
	 
	@Autowired
	OrderDao orderDao;

	@Override
	public List<Pedido> listarPedidos(int id_cliente) {
		
		return orderDao.listarPedidos(id_cliente);
	}

}
