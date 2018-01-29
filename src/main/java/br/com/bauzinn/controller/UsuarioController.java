package br.com.bauzinn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bauzinn.model.Usuario;
import br.com.bauzinn.service.UsuarioServiceImpl;

@RestController
@RequestMapping("bauzinn")
public class UsuarioController {
	
	@Autowired
	public UsuarioServiceImpl usuarioServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> getAll(){
		
		List<Usuario> usuarios = usuarioServiceImpl.getAll();
		
	  return new ResponseEntity<List<Usuario>>( usuarios, HttpStatus.OK);
	}
	
	@RequestMapping(value = "{login}", method = RequestMethod.GET)	
	public ResponseEntity<Usuario> getUsuario(@PathVariable String login){
		
		Usuario u = usuarioServiceImpl.getUsuario(login);
		
        return new ResponseEntity<Usuario>(u,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)	
	public ResponseEntity<String> salvarUsuario(@RequestBody Usuario usuario){
		
		String resposta = usuarioServiceImpl.postUsuario(usuario);
		
        return new ResponseEntity<String>(resposta,HttpStatus.OK);	
	}

	
	@RequestMapping(method = RequestMethod.PUT)	
	public ResponseEntity<String> atualizarUsuario(@RequestBody Usuario usuario){
		
		String resposta = usuarioServiceImpl.putUsuario(usuario);
		
        return new ResponseEntity<String>(resposta,HttpStatus.OK);	
	}
	
	
	@RequestMapping(value = "{login}", method = RequestMethod.DELETE)	
	public ResponseEntity<String> deleteUsuario(@PathVariable String login){
		
		String resposta = usuarioServiceImpl.deleteUsuario(login);
		
        return new ResponseEntity<String>(resposta,HttpStatus.OK);
	}	

}
