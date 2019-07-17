package pe.edu.unsch.service;

import pe.edu.unsch.model.Usuario;

public interface LoginService {
	Usuario loginUser(String username, String password);
}
