package br.com.itau.portalcontrolehoras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.portalcontrolehoras.DAO.AtividadeDAO;
import br.com.itau.portalcontrolehoras.beans.Atividade;

@CrossOrigin("*")
@RestController
public class AtividadesController {
	
	@Autowired
	private AtividadeDAO dao;
	
	@GetMapping("/Atividades")
	public ResponseEntity<ArrayList<Atividade>> getAtividades(){
		ArrayList<Atividade> resposta = (ArrayList<Atividade>)dao.findAll();
		if (resposta.size() == 0) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);
	}

}
