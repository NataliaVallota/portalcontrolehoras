package br.com.itau.portalcontrolehoras.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.portalcontrolehoras.beans.Ocorrencia;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia, Integer> {

}
