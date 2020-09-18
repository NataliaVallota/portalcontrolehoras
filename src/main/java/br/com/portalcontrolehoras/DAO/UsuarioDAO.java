package br.com.portalcontrolehoras.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.portalcontrolehoras.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

	Usuario findByRacfAndSenha (String racf, String senha);
}
