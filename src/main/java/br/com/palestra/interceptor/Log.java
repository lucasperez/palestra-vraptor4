package br.com.palestra.interceptor;

import javax.enterprise.context.RequestScoped;

import br.com.caelum.vraptor.AfterCall;
import br.com.caelum.vraptor.BeforeCall;
import br.com.caelum.vraptor.Intercepts;

@Intercepts
@RequestScoped
public class Log {
	
	@BeforeCall
	public void before() {
		System.out.println("antes da chamada");
	}
	
	@AfterCall
	public void after() {
		System.out.println("após a chamada");
	}
}
