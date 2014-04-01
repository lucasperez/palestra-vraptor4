package br.com.palestra.controller;

import static br.com.caelum.vraptor.view.Results.json;
import static br.com.caelum.vraptor.view.Results.xml;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.palestra.dao.FuncionarioDAO;
import br.com.palestra.domain.Funcionario;
import br.com.palestra.domain.Public;

@Controller
@Path("funcionario")
public class FuncionarioController {
	
	@Inject
	private FuncionarioDAO funcionarioDAO;
	
	@Inject
	private Result result;
	
	@Public
	public List<Funcionario> list() {
		return funcionarioDAO.listAll();
	}
	
	@Post
	public void salvar(Funcionario funcionario) {
		funcionarioDAO.save(funcionario);
		result.redirectTo(this).list();
	}
	
	@Path({"form", "form/{funcionario.id}"})
	public void form(Funcionario funcionario) {
		if (funcionario.getId() != null) {
			Funcionario f = funcionarioDAO.loadBy(funcionario.getId());
			result.include("funcionario", f);	
		}
	}
	
	@Path("deletar/{funcionario.id}")
	public void deletar(Funcionario funcionario) {
		funcionarioDAO.delete(funcionario);
		result.redirectTo(this).list();
	}
	
	@Path("xml")
	public void listFuncionariosInXml() {
		result.use(xml()).from(this.list(), "funcionarios").serialize();
	}
	
	@Path("json")
	public void listFuncionariosInJson() {
		result.use(json()).from(this.list(), "funcionarios").serialize();
	}
}