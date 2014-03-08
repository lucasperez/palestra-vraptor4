package br.com.palestra.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Session;

import br.com.palestra.domain.Funcionario;

@RequestScoped
public class FuncionarioDAO {

	@Inject
	private Session session;

	public List<Funcionario> listAll() {
		return session.createCriteria(Funcionario.class).list();
	}

	public void save(Funcionario funcionario) {
		session.saveOrUpdate(funcionario);
	}

	public void delete(Funcionario funcionario) {
		session.delete(funcionario);
	}

	public Funcionario loadBy(Long id) {
		return (Funcionario) session.load(Funcionario.class, id);
	}
}
