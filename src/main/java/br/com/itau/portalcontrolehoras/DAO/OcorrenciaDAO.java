package br.com.itau.portalcontrolehoras.DAO;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.portalcontrolehoras.beans.Ocorrencia;
import br.com.itau.portalcontrolehoras.beans.Usuario;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia, Integer> {

	ArrayList<Ocorrencia> findByUsuario(Usuario usuario);
}
