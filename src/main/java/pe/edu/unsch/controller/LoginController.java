package pe.edu.unsch.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.edu.unsch.model.Cliente;
import pe.edu.unsch.model.Producto;
import pe.edu.unsch.model.Usuario;
import pe.edu.unsch.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping({"/login", "/"})
	public String index() {
		return "views/public/login/login";
		
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getResponsable(HttpServletRequest r, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		String username = r.getParameter("username");
		String password = r.getParameter("password");
		
		Usuario usuario = new Usuario();
		boolean isLogin = false;
		
		try {
			usuario = loginService.loginUser(username,password);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(usuario != null) {
			isLogin = true;
			Cliente cliente = usuario.getCliente();
			session.setAttribute("cliente", cliente);
		} 
		
		map.put("isLogin", isLogin);
		return map;
	}
}
