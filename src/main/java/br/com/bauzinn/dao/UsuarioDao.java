package br.com.bauzinn.dao;

import java.util.List;

import br.com.bauzinn.model.Usuario;

public interface UsuarioDao{
	
	public List <Usuario> getAll();
	
	public Usuario getUsuario(String usuarioId);
	
	public Usuario salvarUsuario(Usuario usuario);
	
	public Usuario atualizarUsuario(Usuario usuario);
	
	public String deleteUsuario(String usuarioId);
	

	

}
