package br.com.bauzinn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.bauzinn.dao.UsuarioDaoImpl;
import br.com.bauzinn.model.Usuario;

public class UsuarioServiceImpl implements UsuarioService  {
	
	@Autowired
	public UsuarioDaoImpl usuariodaoImpl;
	
	@Override
	public List<Usuario> getAll() {
		List<Usuario> usuarios = usuariodaoImpl.getAll();
		return usuarios;
	}
	
	@Override
	public Usuario getUsuario (String login) {
		Usuario usuario = usuariodaoImpl.getUsuario(login);
		return usuario;
	}
	
	@Override
	public String  postUsuario (Usuario  usuario) {
		usuariodaoImpl.salvarUsuario(usuario);
		return "Salvo" ;
	}
	@Override
	public String putUsuario (Usuario usuario) {
	    usuariodaoImpl.atualizarUsuario(usuario);		
		return "Alterei";
		
	}
	@Override
	public String deleteUsuario (String login) {
		usuariodaoImpl.deleteUsuario(login);
			
		return "Deletado" ;
	}
	
}
