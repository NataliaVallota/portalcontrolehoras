package br.com.portalcontrolehoras.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.portalcontrolehoras.beans.Atividade;

public interface AtividadeDAO extends CrudRepository<Atividade, Integer>  {

}
