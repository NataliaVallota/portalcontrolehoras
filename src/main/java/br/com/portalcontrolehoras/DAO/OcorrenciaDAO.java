package br.com.portalcontrolehoras.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.portalcontrolehoras.beans.Ocorrencia;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia, Integer> {

}
