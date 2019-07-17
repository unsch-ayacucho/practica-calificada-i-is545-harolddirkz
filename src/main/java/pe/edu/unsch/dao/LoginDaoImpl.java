package pe.edu.unsch.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.model.Usuario;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Usuario loginUser(String username, String password) {
		try {
			return (Usuario) entityManager
					.createQuery("from Usuario where username = :username and password = :password")
					.setParameter("username", username).setParameter("password", password).getSingleResult();

		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

}
