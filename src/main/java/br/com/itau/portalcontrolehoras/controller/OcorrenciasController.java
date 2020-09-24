package br.com.itau.portalcontrolehoras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.portalcontrolehoras.DAO.OcorrenciaDAO;
import br.com.itau.portalcontrolehoras.DAO.UsuarioDAO;
import br.com.itau.portalcontrolehoras.beans.Ocorrencia;
import br.com.itau.portalcontrolehoras.beans.Usuario;

@CrossOrigin("*")
@RestController
public class OcorrenciasController {
	
	@Autowired
	private OcorrenciaDAO dao;
	
	@Autowired
	private UsuarioDAO daoUser;
	
	@GetMapping("/Ocorrencias")
	public ResponseEntity<ArrayList<Ocorrencia>> getOcorrencias(){
		ArrayList<Ocorrencia> resposta = (ArrayList<Ocorrencia>)dao.findAll();
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/Ocorrencia/{id}")
	public ResponseEntity<Ocorrencia> getOcorrencia(@PathVariable int id){
		Ocorrencia resposta = dao.findById(id).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/ListaOcorrenciasID/{id}")
	public ResponseEntity<ArrayList<Ocorrencia>> getOcorrenciasPorUsuarioId(@PathVariable int id){
		Usuario usuario = new Usuario();
		usuario.setId_usuario(id);
		ArrayList<Ocorrencia> resposta = (ArrayList<Ocorrencia>)dao.findByUsuario(usuario);
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/ListaOcorrenciasRacf/{racf}")
	public ResponseEntity<ArrayList<Ocorrencia>> getOcorrenciasPorUsuarioRacf(@PathVariable String racf){		
		Usuario usuario = daoUser.findByRacf(racf);
		ArrayList<Ocorrencia> resposta = (ArrayList<Ocorrencia>)dao.findByUsuario(usuario);
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/ListaOcorrenciasStatus/{status}")
	public ResponseEntity<ArrayList<Ocorrencia>> getOcorrenciasPorStatus(@PathVariable String status){				
		ArrayList<Ocorrencia> resposta = (ArrayList<Ocorrencia>)dao.findBystatus(Integer.parseInt(status));
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/ListaOcorrenciasRacfStatus/{racf}/{status}")
	public ResponseEntity<ArrayList<Ocorrencia>> getOcorrenciasPorUsuarioStatus(@PathVariable String racf,@PathVariable String status){	
		Usuario usuario = daoUser.findByRacf(racf);
		ArrayList<Ocorrencia> resposta = (ArrayList<Ocorrencia>)dao.findBystatusAndUsuario(Integer.parseInt(status),usuario);
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/AtualizaOcorrencia")
	public ResponseEntity<Ocorrencia> doAtualizaOcorrencia(@RequestBody Ocorrencia ocorrencia){
		Ocorrencia resposta = dao.save(ocorrencia);
		if (resposta==null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}

}
