package br.com.palestra.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("primeiro")
public class PrimeiroController {
	
	@Inject
	private Result result;
	
	 /**
     * @deprecated CDI eyes only
     */
    protected PrimeiroController() {
        this(null);
    }

    @Inject
    public PrimeiroController(Result result) {
        this.result = result;
    }

	@Path("pagina-inicial")
	@Get
	public void home() {
		result.include("message", "Olá mundo !!!");
	}
}