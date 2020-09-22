package br.com.itau.portalcontrolehoras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.portalcontrolehoras.DAO.UsuarioDAO;
import br.com.itau.portalcontrolehoras.beans.Usuario;

@CrossOrigin("*")
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> doLogin(@RequestBody Usuario user){
		Usuario resposta = dao.findByRacfAndSenha(user.getRacf(), user.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
}
