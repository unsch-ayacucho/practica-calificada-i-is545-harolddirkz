package pe.edu.unsch.dao;

import pe.edu.unsch.model.Usuario;

public interface LoginDao {
	Usuario loginUser(String username, String password);
}
