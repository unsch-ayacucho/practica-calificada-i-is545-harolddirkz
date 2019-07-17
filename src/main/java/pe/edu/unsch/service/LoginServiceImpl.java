package pe.edu.unsch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.LoginDao;
import pe.edu.unsch.model.Usuario;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;

	@Override
	public Usuario loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return loginDao.loginUser(username, password);
	}
	
	
}
