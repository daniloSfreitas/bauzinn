package br.com.bauzinn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.com.bauzinn.model.Usuario;

public class UsuarioDaoImpl implements UsuarioDao  {	
	
	
    @Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public List<Usuario> getAll() {
		
		List<Usuario> usuarios = null;
		try{
			usuarios = mongoTemplate.findAll(Usuario.class, "usuario");
		}catch (Exception e) {
	     System.out.println(e);
		}
		return usuarios;
	}

	@Override
	public Usuario getUsuario(String login) {
		Usuario u = null;
		try{
			u = mongoTemplate.findOne(new Query(Criteria.where("login").is(login)), Usuario.class, "usuario");
		}catch (Exception e) {
	     System.out.println(e);
		}
		return u;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {

		try{
			mongoTemplate.insert(usuario,"usuario");
		}catch (Exception e) {
	     System.out.println(e);
		}
		
		return usuario;
	}

	@Override
	public Usuario atualizarUsuario(Usuario usuario) {
		
		try{
			mongoTemplate.insert(usuario,"usuario");
		}catch(Exception e){
			System.out.println(e);		
		
		}
		return usuario;
	}

	@Override
	public String deleteUsuario(String login) {
		try{
			mongoTemplate.remove(new Query(Criteria.where("login").is(login)),"usuario");
		}catch(Exception e){
			System.out.println(e);		
		
		}
		return "Deletado";
	}

}
