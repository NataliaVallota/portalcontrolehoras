package br.com.itau.portalcontrolehoras.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.portalcontrolehoras.beans.Atividade;

public interface AtividadeDAO extends CrudRepository<Atividade, Integer>  {

}
