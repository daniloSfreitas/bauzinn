package br.com.bauzinn.service;

import java.util.List;

import br.com.bauzinn.model.Usuario;

public interface UsuarioService {
	
	public List <Usuario> getAll();
	
	public Usuario getUsuario (String usuarioId);
	
	public String  postUsuario (Usuario  usuario);
	
	public String putUsuario (Usuario usuario);
	
	public String deleteUsuario (String usuarioId);

}
