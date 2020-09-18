package br.com.itau.portalcontrolehoras.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.portalcontrolehoras.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

	Usuario findByRacfAndSenha (String racf, String senha);
}
